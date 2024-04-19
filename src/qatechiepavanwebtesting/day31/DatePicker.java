package qatechiepavanwebtesting.day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
    public static void main (String args []){

        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        //driver.findElement(By.id("datepicker")).sendKeys("03/10/1987");

        //using logic
        String year = "1987";
        String month = "March";
        String day = "10";

        driver.findElement(By.id("datepicker")).click(); //opens date picker

        while((true))
        {
            String mon = driver.findElement(By.xpath("//iframe[@class='demo-frame']")).getText();
            String yr = driver.findElement(By.xpath("//iframe[@class='demo-frame']")).getText();

            if (mon.equals(month) && yr.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//iframe[@class='demo-frame']")).click(); // click on next arrow

        }


    }
}
