package qatechiepavanwebtesting.day31;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class ScrollingWebPage {

    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        //WebDriver driver = new FirefoxDriver(); //this is not able to access javascriptexecutor interface
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        //JavascriptExecutor js= (JavascriptExecutor) driver; //typecasting

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        //1. Scroll down
//        js.executeScript("window.scrollBy(0, 3000)", "");
//        long value =(Long) js.executeScript("return window.pageYOffset;");
//        System.out.println("Number of pixels moved:" +  value);


//        //2. Scroll down the page till element is visible
//        WebElement nig_Flag =driver.findElement(By.xpath("//img[@alt='Flag of Nigeria']"));
//
//        js.executeScript("arguments[0].scrollIntoView();",nig_Flag);
//        long value = (Long) js.executeScript("return window.pageYOffset;");


        //3. Scroll till the end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        double value = (Double) js.executeScript("return window.pageYOffset;");
        System.out.println("Number of pixels moved :" + value);

        Thread.sleep(5000);

        //4. go back to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); //go back to the initial position

         Thread.sleep(3000);
        driver.quit();
    }
}
