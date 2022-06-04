package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainProductPage extends BasePage{

    public BrainProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyBtn() {
        return driver.findElement(By.xpath("//a[@class='add btn-add-green']"));
    }

    public WebElement getCheckOut() {
        return driver.findElement(By.xpath("//*[@id='checkout-modal-popup']/div/div[1]/div/div[2]/div/div[5]/button"));
    }   //по-іншому неможливо було взяти локатор

    public WebElement getDescription() {
        return driver.findElement(By.xpath("//a[text()='Характеристики і опис']"));
    }

    public WebElement getReviews() {
        return driver.findElement(By.xpath("//div[@class='br-pt-menu-in']//a[@href='#reviews']"));
    }

    public WebElement getToTop() {
        return driver.findElement(By.xpath("//button[text()='Вгору']"));
    }
}
