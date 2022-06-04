package brain.com.ua.tests.computers;

import brain.com.ua.pageObjects.BrainComputersPage;
import brain.com.ua.pageObjects.BrainHomePage;
import brain.com.ua.pageObjects.BrainOrderPage;
import brain.com.ua.pageObjects.BrainProductPage;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_3 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                            // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getComputers().click();        // переходимо у розділ "Ноутбуки і комп'ютери"

        BrainComputersPage computersPage = new BrainComputersPage(driver);
        computersPage.getMonitors().click();    // обираємо категорію "Монітори та аксесуари"
        computersPage.getSubcategory().click(); // обираємо підкатегорію
        computersPage.getFirstModel().click();  // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getDescription().click();   // клік по опису товару
        productPage.getToTop().click();         // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();        // клік по кнопці "Купити"
        productPage.getCheckOut().click();      // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();     // вибір способу оплати
        orderPage.newPost().click();            // вибір доставки Новою Поштою
        orderPage.recipientData();              // заповнення контактних даних
        orderPage.cancelPurchase();             // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
