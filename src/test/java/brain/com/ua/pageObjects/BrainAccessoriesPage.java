package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainAccessoriesPage extends BasePage{
    public BrainAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getVideoCards() {
        return driver.findElement(By.xpath("//h2[text()='Відеокарти']"));
    }
    public WebElement getProcessors() {
        return driver.findElement(By.xpath("//h2[text()='Процесори']"));
    }
    public WebElement getMotherBoards() {
        return driver.findElement(By.xpath("//h2[text()='Материнські плати']"));
    }
}
