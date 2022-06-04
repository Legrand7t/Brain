package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainTelevisionsPage extends BasePage{
    public BrainTelevisionsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTelevisions() {
        return driver.findElement(By.xpath("//h2[text()='Телевізори']"));
    }
    public WebElement getHomeCinemas() {
        return driver.findElement(By.xpath("//h2[text()='Домашні кінотеатри']"));
    }
    public WebElement getMediaPlayers() {
        return driver.findElement(By.xpath("//h2[text()='Медіаплеєри']"));
    }
}
