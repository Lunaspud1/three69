package qatechiepavanwebtesting.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver drv = new FirefoxDriver();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        drv.get("https://www.bing.com/");
        drv.manage().window().maximize();

        drv.findElement(By.id("sb_form_q")).sendKeys("Selenium");
        List <WebElement> searchOptons = drv.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//div[@class='sa_tm']"));
        //Finding number of options
        System.out.println("Number of search options: " + searchOptons.size()); //9

        //Printing options (enhanced for loop
//        for (WebElement options:searchOptons)
//        {
//            System.out.println(options.getText());
//        }
        //or
//        for (int i=0; i<searchOptons.size(); i++)
//        {
//            System.out.println(searchOptons.get(i).getText());
//        }

        //select specific option from auto suggest drop down
        for (WebElement option:searchOptons)
        {
            if (option.getText().equals("python selenium"))
            {
                option.click();
                break;
            }
        }


//drv.quit();



    }
}

