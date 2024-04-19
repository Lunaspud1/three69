package qatechiepavanwebtesting.day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HandleDopdownWithoutSelectTag {
    public static void main(String args[]) {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();

        //Capture all options and print in console
        List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='input-country']/option"));
//        //use enhanced for loop statement to print all options
//        for (WebElement allopt:alloptions)
//        {System.out.println(allopt.getText());

//        //for loop to print in console
//        for (int i = 0; i<alloptions.size(); i++) {
//            System.out.println("Alloptions from Country webelement: " + alloptions.get(i).getText());

        //finding total number of options
        System.out.println("Total number of options: " + alloptions.size()); //242

        //selecting option from dropdown (with no Select class)
        for (WebElement option:alloptions)
        {
            if (option.getText().equals("Egypt"))
            {
                option.click();
                break;
            }
        }



        }
    }
