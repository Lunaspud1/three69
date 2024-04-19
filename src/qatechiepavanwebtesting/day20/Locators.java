package qatechiepavanwebtesting.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main (String args [])
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com/");
        driver.manage().window().maximize();
        //find element By id locator
        driver.findElement(By.id("search")).sendKeys("T-shirts");
        //no search button available, so using enter key on keyboard
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  //By name locator
        //driver.findElement(By.linkText("Erikssen CoolTech™ Fitness Tank")).click();  //locator by linkText (mostly used for links)
        driver.findElement(By.partialLinkText("Erikssen CoolTech™")).click();  //partial linktext (no need to parse the complete value of element)
        driver.close();



    }
}
