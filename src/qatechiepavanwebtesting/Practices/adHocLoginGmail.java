package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class adHocLoginGmail {

    public static void main (String args []){

        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.skysports.com/");
        driver.manage().window().maximize();

        driver.switchTo().frame("sp_message_iframe_758392");
        //driver.findElement(By.xpath())
               // findElement(By.xpath("//a[@id='site-nav-desktop-sports-more']//*[name()='svg']")).click();
    }
}
