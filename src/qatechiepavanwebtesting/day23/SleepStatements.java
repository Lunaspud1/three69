package qatechiepavanwebtesting.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatements {
    public static void main (String args[]) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");
        //Thread.sleep is not recommended
        Thread.sleep(5000);  //5secs
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys(Keys.RETURN);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[normalize-space()='Selenium - Selenium Selenium automates browsers']")).click();
    }
}
