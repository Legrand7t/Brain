package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainHouseholdAppPage extends BasePage{

    public BrainHouseholdAppPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBlenders() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Блендери')]"));
    }
    public WebElement getVacuumCleaners() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Пилососи')]"));
    }
    public WebElement getTrimmers() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Тримери')]"));
    }
}
