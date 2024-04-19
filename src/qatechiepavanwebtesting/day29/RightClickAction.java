package qatechiepavanwebtesting.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement rightC_Button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        //Right click operation
        Actions act = new Actions(driver);
        //always remember to add perform method
        act.moveToElement(rightC_Button).contextClick().perform();
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();  //copy
        //Thread.sleep(5000);
        driver.switchTo().alert().accept();

        act.moveToElement(rightC_Button).contextClick().perform();
        driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();  //delete
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

    }
}
