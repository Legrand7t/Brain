package brain.com.ua.tests.gaming;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_1 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                // переходимо на головну сторінку сайта
        Thread.sleep(3000);
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.allCategories();                   // наводимо мишку на "Всі категорії"
        homePage.getGaming().click();               // переходимо у розділ "Геймінг і кіберспорт"

        BrainGamingPage gamingPage = new BrainGamingPage(driver);
        gamingPage.getSSD().click();                // обираємо категорію "Накопичувачі SSD"
        gamingPage.getFirstModel().click();         // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getDescription().click();       // клік по опису товару
        productPage.getToTop().click();             // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();            // клік по кнопці "Купити"
        productPage.getCheckOut().click();          // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();         // вибір способу оплати
        orderPage.newPost().click();                // вибір доставки Новою Поштою
        orderPage.recipientData();                  // заповнення контактних даних
        orderPage.cancelPurchase();                 // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
