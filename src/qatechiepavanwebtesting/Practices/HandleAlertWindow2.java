package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandleAlertWindow2 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

       /* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        //Switch to alert/popup window and save into variable
        Alert alert_Window = driver.switchTo().alert();
        //Get alert text displayed
        System.out.println("Alert text displayed on pop up window is : " + alert_Window.getText());
        //Not necessary but want to see webdriver action in runtime
        Thread.sleep(5000);

        alert_Window.accept();


        driver.close();
    }
       */
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert_win = driver.switchTo().alert();
        System.out.println("Text displayed on alert window: " + alert_win.getText());
        Thread.sleep(5000);
        alert_win.accept();
        //alert_win.dismiss();

        driver.close();


    }
}
