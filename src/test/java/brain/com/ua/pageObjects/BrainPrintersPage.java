package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainPrintersPage extends BasePage{
    public BrainPrintersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLaserPrinters() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Лазерні')]"));
    }
    public WebElement getInkjetPrinters() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Струменеві')]"));
    }
    public WebElement getPlotters() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Плоттери')]"));
    }
}
