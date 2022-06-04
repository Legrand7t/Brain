package brain.com.ua.tests.household;

import brain.com.ua.pageObjects.*;
import brain.com.ua.tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyFromCategory_2 extends TestInit {

    @Test
    public void doIt() throws InterruptedException {

        goToBrain();                                    // переходимо на головну сторінку сайта
        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getHouseholdApp().click();             // переходимо у розділ "Побутова техніка"

        BrainHouseholdAppPage householdAppPage = new BrainHouseholdAppPage(driver);
        householdAppPage.getVacuumCleaners().click();   // обираємо категорію "Пилососи"
        householdAppPage.getFirstModel().click();       // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getReviews().click();               // клік по відгукам
        productPage.getToTop().click();                 // повертаємось наверх сторінки
        Thread.sleep(3000);
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
