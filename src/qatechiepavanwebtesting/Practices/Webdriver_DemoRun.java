package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_DemoRun {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //create an instance of webdriver using new keyword
        WebDriver driver = new ChromeDriver();

        //Launch the webbrowser
        driver.get("https://demo.nopcommerce.com/");
        //maximizes the window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("abc");
        driver.findElement(By.id("LastName")).sendKeys("xyz");
        //driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.id("Email")).sendKeys("abcxyz@gmail.com");






        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(5000);
        driver.close();
    }
}
