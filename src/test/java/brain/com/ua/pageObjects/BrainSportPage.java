package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainSportPage extends BasePage{

    public BrainSportPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBicycles() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Велосипеди')]"));
    }
    public WebElement getDumbbells() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Гантелі')]"));
    }
    public WebElement getExpanders() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Еспандери')]"));
    }
}
