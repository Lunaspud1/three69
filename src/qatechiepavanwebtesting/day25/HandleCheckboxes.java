package qatechiepavanwebtesting.day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");

        WebDriver driver= new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        //1. Select specific checkbox
        //driver.findElement(By.id("monday")).click();

        //2. To find total number of checkboxes
        List<WebElement> check_boxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        System.out.println("Number OF Checkboxes: " + check_boxes.size());

        //3. select multiple/all checkboxes using for loop
        for (int i = 0; i < check_boxes.size(); i++) {
            check_boxes.get(i).click();
        }
//
//        //using for each loop
////        for (WebElement chbx:check_boxes)
////        {
//            chbx.click();
        //4. selecting last 3 checkboxes
//        for (int i=4; i<check_boxes.size(); i++)
//        {
//            check_boxes.get(i).click();
//        }
//        //5. Select first 2 checkboxes
//        for (int i=0; i<2; i++)
//        {
//            check_boxes.get(i).click();
//        }
        //clear /uncheck checkboxes
        Thread.sleep(5000);
//        for (int i =0; i< check_boxes.size(); i++)
//        {
//            if (check_boxes.get(i).isSelected())
//            check_boxes.get(i).click();
//        }
        //enhanced for loop to uncheck checkboxes
        for (WebElement chbx : check_boxes) {
            if (chbx.isSelected()) ;
            {
                chbx.click();
            }
        }
    }
}
