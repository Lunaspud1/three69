package qatechiepavanwebtesting.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionvsActionDemo {
    public static void main (String args [])
    {
        System.setProperty("webdriber.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("ttp://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        //Rick click operation
        Actions act = new Actions(driver);

        //act.contextClick(button).perform(); //Right click on button

        Action myaction = act.contextClick(button).build();  //here we are storing an action into a variable
        act.perform(); //here we are performing an action which is created above

    }
}
