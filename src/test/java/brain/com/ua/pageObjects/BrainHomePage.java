package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrainHomePage extends BasePage{
    public BrainHomePage(WebDriver driver) {
        super(driver);
    }

    // Categories
    public WebElement getComputers() {
        return driver.findElement(By.xpath("//span[contains(text(),'Ноутбуки')]"));
    }
    public WebElement getAccessories() {
        return driver.findElement(By.xpath("//span[contains(text(),'Комплектуючі')]"));
    }
    public WebElement getSmartphones() {
        return driver.findElement(By.xpath("//span[contains(text(),'Смартфони')]"));
    }
    public WebElement getTVs() {
        return driver.findElement(By.xpath("//span[contains(text(),'Телевізори')]"));
    }
    public WebElement getPrinters() {
        return driver.findElement(By.xpath("//span[contains(text(),'Все для друку')]"));
    }
    public WebElement getNetworkHardware() {
        return driver.findElement(By.xpath("//span[contains(text(),'Мережеве обладнання')]"));
    }
    public WebElement getAcoustics() {
        return driver.findElement(By.xpath("//span[contains(text(),'акустика')]"));
    }
    public WebElement getGadgets() {
        return driver.findElement(By.xpath("//span[contains(text(),'Гаджети')]"));
    }
    public WebElement getHouseholdApp() {
        return driver.findElement(By.xpath("//span[contains(text(),'Побутова техніка')]"));
    }
    public WebElement getGoodsForChild() {
        return driver.findElement(By.xpath("//span[contains(text(),'Товари для дітей')]"));
    }
    public WebElement getSmartHome() {
        return driver.findElement(By.xpath("//span[contains(text(),'Розумний дім')]"));
    }
    public WebElement getHouse() {
        return driver.findElement(By.xpath("//span[contains(text(),'Дім')]"));
    }
    public WebElement getTools() {
        return driver.findElement(By.xpath("//span[contains(text(),'Інструменти')]"));
    }
    public WebElement getSport() {
        return driver.findElement(By.xpath("//span[contains(text(),'Спорт')]"));
    }
    public WebElement getGaming() {
        return driver.findElement(By.xpath("//span[contains(text(),'Геймінг')]"));
    }

    // mouse move to element
    public void allCategories() {
        WebElement element = driver.findElement(By.xpath("//a/span[text()='Всі категорії']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
