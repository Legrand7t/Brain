package brain.com.ua.tests.printers;

import brain.com.ua.pageObjects.BrainHomePage;
import brain.com.ua.pageObjects.BrainOrderPage;
import brain.com.ua.pageObjects.BrainProductPage;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromSearch extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                                    // переходимо на головну сторінку сайта
        Thread.sleep(2000);
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getSearchField().sendKeys("принтер Canon"); // ввід у поле пошуку
        homePage.getSearchBtn().click();                                // клік по кнопці "Знайти"
        homePage.getFirstResult().click();                              // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        Thread.sleep(3000);
        productPage.getBuyBtn().click();                                // клік по кнопці "Купити"
        productPage.getCheckOut().click();                              // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();                                   // вибір способу оплати
        orderPage.newPost().click();                                    // вибір доставки Новою Поштою
        orderPage.recipientData();                                      // заповнення контактних даних
        orderPage.cancelPurchase();                                     // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
