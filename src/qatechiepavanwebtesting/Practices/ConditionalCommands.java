package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        //isDisplayed and isEnabled
        //WebElement searchbox = driver.findElement(By.id("small-searchterms"));
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Display Status: "+ searchbox.isDisplayed());
        System.out.println("Enabled Status: " +searchbox.isEnabled());

        //  isSelected
        System.out.println("Before selection.................");
        WebElement male_radiobtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("Male radio button selected status: " + male_radiobtn.isSelected());
        WebElement female_radiobtn = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Female radio button status: " + female_radiobtn.isSelected());

        System.out.println("After Selection.............");
        male_radiobtn.click();
        System.out.println("After selecting male--------------------");
        System.out.println("Male radio button status " + male_radiobtn.isSelected());  //true
        System.out.println("Female radio button status: " + female_radiobtn.isSelected());  //false
        System.out.println("After selecting female------------");
        female_radiobtn.click();
        System.out.println("Female radio button status: " + female_radiobtn.isSelected());  //true
        System.out.println("Male radio button status " + male_radiobtn.isSelected());  //false





    }
}
