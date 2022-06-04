package brain.com.ua.tests.house;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_2 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                // переходимо на головну сторінку сайта
        Thread.sleep(3000);
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.allCategories();                   // наводимо мишку на "Всі категорії"
        homePage.getHouse().click();                // переходимо у розділ "Дім, краса та здоров'я"

        BrainHousePage housePage = new BrainHousePage(driver);
        housePage.getGloves().click();              // обираємо категорію "Рукавички"
        housePage.getFirstModel().click();          // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getReviews().click();           // клік по відгукам
        productPage.getToTop().click();             // повертаємось наверх сторінки
        Thread.sleep(3000);
        productPage.getBuyBtn().click();            // клік по кнопці "Купити"
        productPage.getCheckOut().click();          // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();               // вибір способу оплати
        orderPage.newPost().click();                // вибір доставки Новою Поштою
        orderPage.recipientData();                  // заповнення контактних даних
        orderPage.cancelPurchase();                 // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
