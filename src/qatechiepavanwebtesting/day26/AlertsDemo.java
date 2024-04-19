package qatechiepavanwebtesting.day26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertsDemo {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(); //opens alert window

        //use switchTo command to switch to alert window then capture the window like an object e.g. webelement
        Alert alertWindow = driver.switchTo().alert();    //to store alert into a variable the type should be Alert

        System.out.println("Capturing text from alert window: "+ alertWindow.getText());
        Thread.sleep(5000);
        alertWindow.sendKeys("welcome"); //to pass value into alert input box inside alert window
        //alertWindow.accept(); //to close alert window by using OK button
        alertWindow.dismiss(); //to close alert window using Cancel button

    }
}
