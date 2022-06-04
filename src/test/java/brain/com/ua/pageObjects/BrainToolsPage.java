package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainToolsPage extends BasePage{

    public BrainToolsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCrowns() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Коронки')]"));
    }
    public WebElement getJacks() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Домкрати')]"));
    }
    public WebElement getSockets() {
        return driver.findElement(By.xpath("//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Розетки')]"));
    }
}
