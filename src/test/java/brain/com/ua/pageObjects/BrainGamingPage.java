package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainGamingPage extends BasePage{

    public BrainGamingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSSD() {
        return driver.findElement(By.xpath("//h2[text()='Накопичувачі SSD']"));
    }
    public WebElement getRAM() {
        return driver.findElement(By.xpath("//h2[text()=\"Модулі пам'яті для ПК\"]"));
    }
    public WebElement getPowerUnits() {
        return driver.findElement(By.xpath("//h2[text()='Блоки живлення']"));
    }
}
