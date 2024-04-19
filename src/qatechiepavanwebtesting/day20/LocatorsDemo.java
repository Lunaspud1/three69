package qatechiepavanwebtesting.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {
    public static void main (String args [])
    {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        //Absolute Xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("T-shirt");
//        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);

//        //Relative Xpath (same elements as above
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("T-shirt");
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);

//        //xpath wit 'or'
//        driver.findElement  (By.xpath("//input[@id='search' or @name='w']")).sendKeys("Admin");
//        //xpath with 'and'
//        driver.findElement(By.xpath("//input[@id='search' and @class='input-text']")).sendKeys(Keys.ENTER);

        //xpath with 'contains'  //input[contains(@id, 'first')]
        //driver.findElement(By.xpath("//input[@class, input-text")).click();
//        driver.findElement(By.xpath("//input[contains(@class,'input-text')]")).sendKeys("T-shirt");
//        driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys(Keys.ENTER);

//        //x-path with starts-with()
//        driver.findElement(By.xpath("//input[starts-with(@class,'input')]")).sendKeys("Jackets");
//        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys(Keys.ENTER);

        //x-path wth text
        //driver.findElement(By.xpath("//a[text()='Create an Account']")).click();

//        //chained xpath
          driver.findElement(By.xpath("//form[@id='search_mini_form']//input[1]")).sendKeys("Jackets");
          driver.findElement(By.xpath("//form[@id='search_mini_form']//input[@id='search']")).sendKeys(Keys.ENTER);



    }
}
