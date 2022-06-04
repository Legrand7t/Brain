package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainSmartphonesPage extends BasePage{
    public BrainSmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMobiles() {
        return driver.findElement(By.xpath("//h2[text()='Мобільні телефони']"));
    }
    public WebElement getTablets() {
        return driver.findElement(By.xpath("//h2[text()='Планшети']"));
    }
    public WebElement getPocketBooks() {
        return driver.findElement(By.xpath("//h2[text()='Електронні книги']"));
    }
}
