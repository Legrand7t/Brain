package brain.com.ua.tests.televisions;

import brain.com.ua.pageObjects.BrainHomePage;
import brain.com.ua.pageObjects.BrainOrderPage;
import brain.com.ua.pageObjects.BrainProductPage;
import brain.com.ua.pageObjects.BrainTelevisionsPage;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_1 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                              // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getTVs().click();                // переходимо у розділ "Телевізори і проектори"

        BrainTelevisionsPage televisionsPage = new BrainTelevisionsPage(driver);
        televisionsPage.getTelevisions().click(); // обираємо категорію "Телевізори"
        televisionsPage.getFirstModel().click();  // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getDescription().click();     // клік по опису товару
        productPage.getToTop().click();           // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();          // клік по кнопці "Купити"
        productPage.getCheckOut().click();        // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();       // вибір способу оплати
        orderPage.newPost().click();              // вибір доставки Новою Поштою
        orderPage.recipientData();                // заповнення контактних даних
        orderPage.cancelPurchase();               // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
