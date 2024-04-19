package qatechiepavanwebtesting.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommands {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("https://snapdeal.com");
        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();  //snapdeal.com
        driver.navigate().forward();  //amazon

        driver.navigate().refresh();
    }
}
