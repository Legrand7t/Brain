package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainSmartHomePage extends BasePage{

    public BrainSmartHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCameras() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Камери')]"));
    }
    public WebElement getSensors() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Датчики')]"));
    }
    public WebElement getSmartBulbs() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Розумні лампочки')]"));
    }
}
