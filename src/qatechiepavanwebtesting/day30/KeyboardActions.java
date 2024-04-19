package qatechiepavanwebtesting.day30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main (String args []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        //Thread.sleep(5000);
        driver.manage().deleteAllCookies();

        //driver.findElement(By.xpath("//div[@id='ez-cookie-dialog']")).click();
        driver.findElement(By.xpath("//div[@id='ez-cookie-dialog']//button[@id='ez-accept-all']")).click();
        //WebElement default_box = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        String active_window = driver.getWindowHandle();
        driver.switchTo().window(active_window);
                //frame(default_box);

        driver.findElement(By.id("inputText1")).sendKeys("Welcome To Selenium");

        //keyboard actions
        Actions act = new Actions(driver);

        //ctr a  - select the text
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        //ctrl c -- copy text
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        //tab  - to select the target input box
        //act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();  //or
        act.sendKeys(Keys.TAB).perform();

        //ctrl v  - to paste the copied text
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        //driver.quit();
    }
}
