package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandleAlertAssignment {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //find username element
        driver.findElement(By.name("login")).sendKeys("abracadabra");
        //find password element then click
        driver.findElement(By.name("proceed")).click();
        //Switch to alert /popup window then save into variable
        Alert alert = driver.switchTo().alert();

        //Print out text displayed on alert window
        System.out.println("Text displayed on alert window: " + alert.getText());
        Thread.sleep(5000); //not necessary but just to check webdriver actions in runtime
        alert.accept();
    }
}
