package qatechiepavanwebtesting.day30;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LocationOfElements {

    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Return type of getLocation() method is Point
        Point loc = driver.findElement(By.xpath("//img[@alt='company-branding']")).getLocation();

        System.out.println(loc); // (630, 200)
        //This will get the X axis
        System.out.println(loc.getX());  //630

        //This will get y axis
        System.out.println(loc.getY()); //208

    }
}
