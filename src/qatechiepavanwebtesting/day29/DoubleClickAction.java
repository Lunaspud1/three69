package qatechiepavanwebtesting.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {

    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //close privacy popup
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();
        //find default iframe then save xpath into variable (iframe) then .....
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        //switch to iframe under test
        driver.switchTo().frame(iframe);

        WebElement field1= driver.findElement(By.id("field1"));
        field1.clear();
        field1.sendKeys("Welcome");
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        Actions act = new Actions(driver);
        //act.moveToElement(button).doubleClick().perform();
        act.doubleClick(button).perform();  //doubleclick

        //if getText method is returning 'Text is not the same' use getAttribute() method instead
        //String display_text = driver.findElement(By.xpath("//input[@id='field2']")).getText();
        String value = driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
        System.out.println(value);
        if (value.equals("Welcome"))
        {
            System.out.println("Text is same.......");
        }
        else
        {
            System.out.println("Text is not the same.........");
        }

        //driver.close();
    }
}
