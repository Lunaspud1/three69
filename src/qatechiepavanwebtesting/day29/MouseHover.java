package qatechiepavanwebtesting.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover {
    public static void main (String args []){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");

        //WebDriver driver= new FirefoxDriver();
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktop = driver.findElement(By.linkText("Desktops"));
        //WebElement pc_Option = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
        WebElement mac_Option = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        //Mouse Hover
        Actions act = new Actions(driver);
        //until click method is creating an action.....perform method perform or completes the action
        //act.moveToElement(desktop).moveToElement(pc_Option).moveToElement(mac_Option).click().build().perform();
        //no need to explicitly call build method above (optional) because it is already part of perform method
        act.moveToElement(desktop).moveToElement(mac_Option).click().perform();






    }
}
