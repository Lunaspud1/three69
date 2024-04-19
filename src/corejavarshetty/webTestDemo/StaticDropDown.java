package corejavarshetty.webTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement selectObj = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropDown = new Select(selectObj);
        dropDown.selectByIndex(3);
        System.out.println(dropDown.getFirstSelectedOption().getText());




    }
}
