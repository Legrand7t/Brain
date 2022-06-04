package brain.com.ua.tests.network;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_2 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                        // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getNetworkHardware().click();              // переходимо у розділ "Мережеве обладнання"

        BrainNetworkHardwarePage networkHardwarePage = new BrainNetworkHardwarePage(driver);
        networkHardwarePage.getPassiveNetwork().click();    // обираємо категорію "Пасивне мережеве"
        networkHardwarePage.getSubConnectors().click();     // обираємо підкатегорію "Конектори"
        networkHardwarePage.getFirstModel().click();        // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getReviews().click();                   // клік по відгукам
        productPage.getToTop().click();                     // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();                    // клік по кнопці "Купити"
        productPage.getCheckOut().click();                  // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();                       // вибір способу оплати
        orderPage.newPost().click();                        // вибір доставки Новою Поштою
        orderPage.recipientData();                          // заповнення контактних даних
        orderPage.cancelPurchase();                         // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
