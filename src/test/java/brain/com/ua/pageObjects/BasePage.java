package brain.com.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//div[@class='header-bottom']//input[@class='quick-search-input']"));
    }

    public WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//input[@value='Знайти']"));
    }

    public WebElement getFirstModel() {
        // xpath фізичного розташування першого товару в DOM
        return driver.findElement(By.xpath("//*[@id='view-grid']/div[1]/div/div[2]/div[1]/a"));
    }
    public WebElement getFirstResult() {
        // xpath фізичного розташування першого товару в результатах пошуку в DOM
        return driver.findElement(By.xpath("//div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/a/img"));
    }

    public void getReadyToShip() {
        driver.findElement(By.xpath("//li[@class='focus-filter-link']/a[contains(text(),'Отримати сьогодні')]")).click();
        driver.findElement(By.xpath("//div[@class='visible-lg filters-lg']//a[text()='Показати']")).click();
    }

}
