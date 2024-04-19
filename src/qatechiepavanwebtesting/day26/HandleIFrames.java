package qatechiepavanwebtesting.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandleIFrames {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");

        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?oveview-summary.html");
        driver.manage().window().maximize();

        //find number of iframes on page
        int no_of_Frames = driver.findElements(By.xpath("//iframe")).size();
        System.out.println("No of frames on the page is: " + no_of_Frames);

        //beforre interacting with frame you have to first switch to the frame
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();  //1st frame
        //go back to main page
        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("WebDriver")).click();  //2nd frame
        driver.switchTo().defaultContent();  //go back to main page

        driver.switchTo().frame("classFrame");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();  //3rd frame

    driver.close();
    }

}
