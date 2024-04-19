package qatechiepavanwebtesting.day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main (String rgs []) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
        System.out.println("Location of minimum slider is: " + min_slider.getLocation());//(59, 252)

        act.dragAndDropBy(min_slider, 100, 0).perform();
        System.out.println("Min slider location after moving is: "+ min_slider.getLocation()); //(159, 252)

        WebElement max_slider= driver.findElement(By.xpath("//span[2]"));
        System.out.println("Location of maximum slider is: "+ max_slider.getLocation()); //(750, 252)

        act.dragAndDropBy(max_slider, -100, 0).perform();
        System.out.println("Maximum location after moving is: " + max_slider.getLocation()); //(646, 252)

        Thread.sleep(5000);


        //driver.close();
    }
}
