package qatechiepavanwebtesting.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main (String args [])
    {
//        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");
        driver.findElement(By.id("sb_form_q")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//a[normalize-space()='Selenium - Selenium Selenium automates browsers']")).click();
    }
    }
