package qatechiepavanwebtesting.day18_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class FirstTestCase {

    public static void main (String args []) throws InterruptedException {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
// Launching the browser
        //driver=new ChromeDriver(opt);
        //Open webdriver, specify driver specific driver


        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();//FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement txtUsername = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        //txtUsername.sendKeys("Admin");
        //driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        //get title of the page
        String actual_title = driver.getTitle();
        String expected_title = "OrangeHRM";
        //System.out.println("The title of the web browser page is: " + actual_title);
        if (actual_title.equals(expected_title))
        {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();


    }
}