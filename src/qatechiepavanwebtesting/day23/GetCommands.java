package qatechiepavanwebtesting.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class GetCommands {

    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");  //opens the webbrowser
        driver.manage().window().maximize();

        System.out.println("The title of the page is: " +driver.getTitle());  //returns the title of the page
        String expected_title = "OrangeHRM";
        String actual_title = driver.getTitle();
        if (actual_title.equals(expected_title))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        System.out.println("The url of the page is: " +driver.getCurrentUrl());
        //System.out.println("The page source is: "+ driver.getPageSource());
        String window_handleID = driver.getWindowHandle();
        System.out.println("Window Handle ID is: " +window_handleID);  //CDwindow-F80DB3425F048FA786445F1CA911A536
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> window_handles = driver.getWindowHandles();
        //to retrieve value from Set collection we have to write a looping statement (for)
        for (String winid:window_handles) {
            System.out.println(winid);
        }
        driver.quit();
    }
}

