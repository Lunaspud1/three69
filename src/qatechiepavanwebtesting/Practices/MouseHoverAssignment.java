package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverAssignment {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        WebElement electronics_menu = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        WebElement cam_photo = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']"));

        //Hover Action
        Actions act = new Actions(driver);
        act.moveToElement(electronics_menu).moveToElement(cam_photo).click().perform();



    }
}
