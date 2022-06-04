package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainGadgetsPage extends BasePage{
    public BrainGadgetsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDigitalCameras() {
        return driver.findElement(By.xpath("//h2[text()='Цифрові фотоапарати']"));
    }
    public WebElement getWearableDevices() {
        return driver.findElement(By.xpath("//h2[text()='Носимі пристрої']"));
    }
    public WebElement getDrones() {
        return driver.findElement(By.xpath("//h2[text()='Дрони та коптери']"));
    }
    public WebElement getSubPropellers() {
        return driver.findElement(By.xpath("//h2[text()='Пропелери для дрона']"));
    }
    public WebElement getSubFitBracelets() {
        return driver.findElement(By.xpath("//h2[text()='Фітнес браслети']"));
    }
}
