package qatechiepavanwebtesting.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo2 {
    public static void main (String args [])
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        //find multiple element(s)// return type of find multiple elements is list of webelements
        List<WebElement> top_menu_options = driver.findElements(By.className("level0")); //classname
        //find the number of values in the list collection using size method
        System.out.println("The number of elements in the top menu options is: "+ top_menu_options.size());
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        //driver.close();

/*
        //validate the number of elements
        int expected_number_of_elements = 10;
        //List<WebElement> actual_number_of_elements = top_menu_options;

        if (top_menu_options.equals(expected_number_of_elements)) {
            System.out.println("Test Passed");
        }
        else
            System.out.println("Test Failed");
*/
        //find totL NUMBER OF LINKS ON THE WEB PAGE
        List<WebElement> Total_links_on_page  = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links available on the webpage: " +Total_links_on_page.size());

        //find all the images on the web page
        List<WebElement> number_of_images= driver.findElements(By.tagName("img"));
        System.out.println("Total number of images on the webpage is: "+ number_of_images.size());


        }
    }
