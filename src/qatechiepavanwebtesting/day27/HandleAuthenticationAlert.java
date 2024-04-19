package qatechiepavanwebtesting.day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandleAuthenticationAlert {
    public static void main (String args []) {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.get("http://the-internet.herokuapp.com/basic_auth");
        //won't work on authentication popups
//        Alert alertPopup = driver.switchTo().alert();
//        alertPopup.dismiss();
        //driver.manage().window().maximize();
        //dismiss and accept methods won't work for authentication popups
        //need to pass username and password with url in order to bypass authentication popup
        //syntax: http://username:password@test.com
        //Example: http://admin:admin@the-internet.herokuapp.com/basic_auth
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");






    }
}
