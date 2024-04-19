package qatechiepavanwebtesting.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDropAction {

    public static void main (String args []){
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        //create a action class object
        Actions act = new Actions(driver);

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));
        act.dragAndDrop(rome, italy).perform();

        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement norway = driver.findElement(By.id("box101"));
        act.dragAndDrop(copenhagen, norway).perform();

        WebElement oslo = driver.findElement(By.id("box1"));
        act.dragAndDrop(oslo, norway).perform();

        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement spain = driver.findElement(By.id("box107"));
        act.dragAndDrop(madrid, spain).perform();
    }
}
