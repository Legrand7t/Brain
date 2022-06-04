package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainGoodsForChildPage extends BasePage{

    public BrainGoodsForChildPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getConstructors() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Конструктори')]"));
    }
    public WebElement getPuzzle() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Пазли')]"));
    }
    public WebElement getBaths() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Ванночки')]"));
    }
}
