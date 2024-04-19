package qatechiepavanwebtesting.day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main (String args []) {
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
//        String windowHandle = driver.getWindowHandle();
//        System.out.println("ID of single browser window is: " + windowHandle);  //61951d31-7644-40c0-b142-f6b68374d698,   2b41eb2d-899f-483a-9f59-1a8b038d9e22
        //driver.findElement(By.xpath("//div[@class='orangehrm-login-footer']//a[@href='http://www.orangehrm.com']")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        //capture window handles into set collection

        Set<String> windowidS = driver.getWindowHandles();
        //System.out.println("ID'S of multiple window handles is: " + windowidS);  //[617d7789-8f5c-49c6-ab95-aa9ca63bdc52, 2d0a07f8-61b9-48d0-a103-6f4ae88747f9]

        //convert set collection to list collection in order to extract specific window id values
        //Aproach 1
        /*List<String> windowIDsLists = new ArrayList(windowidS); //convert set to list collection

        //capture individual id's from each browser window into 2 different variables
        String parentWindowID = windowIDsLists.get(0);
        String childWindowID = windowIDsLists.get(1);

        //switch to each browser window then confirm by getting the title of the window
        driver.switchTo().window(childWindowID);
        System.out.println("child window title: " + driver.getTitle());  //OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM

        driver.switchTo().window(parentWindowID);
        System.out.println("parent window title: " + driver.getTitle());  //OrangeHRM

         */

        //Approach 2
       /* for (String windowid:windowidS)
        {
            String title = driver.switchTo().window(windowid).getTitle();
            if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
            {
                //perform operation on 2nf browser window/child window
                driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
            }

        }

        */

        for (String windowid : windowidS) {
            String title = driver.switchTo().window(windowid).getTitle();
            if (title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM") || title.equals("xyz"))
            //if (title.equals("OrangeHRM") || title.equals("xyz"));
            {


                driver.close();
            }
        }
    }





}
