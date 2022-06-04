package brain.com.ua.tests.printers;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_3 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                           // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getPrinters().click();        // переходимо у розділ "Все для друку та офісу"

        BrainPrintersPage printersPage = new BrainPrintersPage(driver);
        printersPage.getPlotters().click();    // обираємо категорію "Плоттери"
        printersPage.getFirstModel().click();  // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getDescription().click();  // клік по опису товару
        productPage.getToTop().click();        // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();       // клік по кнопці "Купити"
        productPage.getCheckOut().click();     // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();    // вибір способу оплати
        orderPage.newPost().click();           // вибір доставки Новою Поштою
        orderPage.recipientData();             // заповнення контактних даних
        orderPage.cancelPurchase();            // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
