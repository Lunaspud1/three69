package qatechiepavanwebtesting.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestSearchbox {

    public static void main (String args []) {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://bing.com");
        driver.findElement(By.id("sb_form_q")).sendKeys("Octagon");
        List<WebElement> search_Options = driver.findElements(By.xpath("//li[@role='option']//span[@class='sa_tm_text']"));
        //Display number of search options
        System.out.println("Number of options displayed for Octagon search are: " + search_Options.size());

        //Display all auto suggestions (enhanced for loop)
//        for (WebElement options:search_Options) {
//            System.out.println(options.getText());
//
//}
             //for loop
            for (int i=0; i<search_Options.size(); i++)
            {
                System.out.println(search_Options.get(i).getText());
            }
        }
    }



