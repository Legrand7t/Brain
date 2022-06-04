package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainHousePage extends BasePage{

    public BrainHousePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAirFresheners() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Освіжувачі повітря')]"));
    }
    public WebElement getGloves() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Рукавички')]"));
    }
    public WebElement getTeapots() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Чайники')]"));
    }
}
