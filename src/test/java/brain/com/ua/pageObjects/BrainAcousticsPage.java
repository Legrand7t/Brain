package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainAcousticsPage extends BasePage{
    public BrainAcousticsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeadphones() {
        return driver.findElement(By.xpath("//h2[text()='Навушники та гарнітури']"));
    }
    public WebElement getAcousticSystems() {
        return driver.findElement(By.xpath("//h2[text()='Акустичні системи']"));
    }
    public WebElement getMicrophones() {
        return driver.findElement(By.xpath("//h2[text()='Мікрофони']"));
    }
}
