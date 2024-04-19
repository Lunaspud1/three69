package qatechiepavanwebtesting.day18_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverAssignment {
    public static void main (String args [])
    {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //crOrangeHRMeate an object of webdriver interface/firefox class
        WebDriver driver = new ChromeDriver(opt);
        //launch url
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("admin");
        driver.findElement(By.id("RememberMe")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String Title_of_the_dashboard_page = driver.getTitle();
        System.out.println(Title_of_the_dashboard_page);
        String Actual_title_of_dashboard_page = "Dashboard / nopCommerce administration";
        if(Title_of_the_dashboard_page.equals(Actual_title_of_dashboard_page))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
            driver.close();
        }
    }
}
