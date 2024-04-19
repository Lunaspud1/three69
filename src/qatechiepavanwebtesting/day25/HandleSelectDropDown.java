package qatechiepavanwebtesting.day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandleSelectDropDown {
    public static void main (String args [])
    {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        //WebDriver driver= new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement drp_CountryEle = driver.findElement(By.xpath("//select[@id='input-country']"));
        Select drop_country = new Select(drp_CountryEle);

        //select option from dropdown
        //drop_country.selectByVisibleText("Guadeloupe");
        //drop_country.selectByValue("33");
        //drop_country.selectByIndex(2);//Albania

        //2. Finding number of options/countries
        List <WebElement> alloptions = drop_country.getOptions();
        System.out.println("Total number of options: " + alloptions.size()); ////242

        //capture all options and prnt in the console for loop
//        for (int i=0; i<alloptions.size(); i++)
//        {
//            System.out.println(alloptions.get(i).getText());
//        }

        // using enhanced for loop
        for (WebElement option:alloptions)
        {
            System.out.println(option.getText());
        }

          driver.close();



    }
}
