package qatechiepavanwebtesting.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_Wait_Demo {public static void main (String args [])
{
    System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
    WebDriver driver = new FirefoxDriver();

    //expicit wait declaration
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));  //expicit wait declaration

    driver.get("https://www.bing.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");
    //explicit wait usage
    try {
        WebElement weblink = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//textarea[@id='sb_form_q']")));
        weblink.click();
    }
    catch (Exception e)
    {
        System.out.println("Element not found....");
    }
    //driver.findElement(By.id("sb_form_q")).sendKeys(Keys.ENTER);

    driver.findElement(By.xpath("//a[normalize-space()='Selenium - Selenium Selenium automates browsers']")).click();
}




}
