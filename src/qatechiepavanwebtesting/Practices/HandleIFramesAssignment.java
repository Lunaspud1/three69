package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandleIFramesAssignment {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame-one1434677811");
        driver.findElement(By.name("RESULT_TextField-1")).sendKeys("abcxyz");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("lmnopq");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("123456789");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Jamaica");
        driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Kingston");
        driver.findElement(By.name("RESULT_TextField-6")).sendKeys("abcxyz@gmail.com");
        driver.findElement(By.cssSelector("#frame-one1434677811")).click();
    }

}
