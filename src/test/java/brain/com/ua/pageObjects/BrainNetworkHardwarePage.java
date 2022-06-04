package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainNetworkHardwarePage extends BasePage{
    public BrainNetworkHardwarePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getActiveNetwork() {
        return driver.findElement(By.xpath("//h2[text()='Активне мережеве']"));
    }
    public WebElement getPassiveNetwork() {
        return driver.findElement(By.xpath("//h2[text()='Пасивне мережеве']"));
    }
    public WebElement getFixedTelephony() {
        return driver.findElement(By.xpath("//h2[text()='Стаціонарна телефонія']"));
    }
    public WebElement getSubRouters() {
        return driver.findElement(By.xpath("//h2[text()='Маршрутизатори']"));
    }
    public WebElement getSubConnectors() {
        return driver.findElement(By.xpath("//h2[text()='Конектори']"));
    }
    public WebElement getSubIP() {
        return driver.findElement(By.xpath("//h2[text()='IP телефони']"));
    }
}
