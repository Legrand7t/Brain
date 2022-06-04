package brain.com.ua.tests.smarthome;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_3 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                    // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getSmartHome().click();                // переходимо у розділ "Розумний дім та охорона"

        BrainSmartHomePage smartHomePage = new BrainSmartHomePage(driver);
        smartHomePage.getSmartBulbs().click();          // обираємо категорію "Розумні лампочки"
        smartHomePage.getFirstModel().click();          // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getReviews().click();               // клік по відгукам
        productPage.getToTop().click();                 // повертаємось наверх сторінки
        Thread.sleep(5000);
        productPage.getBuyBtn().click();                // клік по кнопці "Купити"
        productPage.getCheckOut().click();              // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();                   // вибір способу оплати
        orderPage.byCourier().click();                  // вибір доставки кур'єром
        orderPage.address();                            // вказуємо адресу доставки
        orderPage.recipientData();                      // заповнення контактних даних
        orderPage.cancelPurchase();                     // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
