package corejavarshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main (String args []) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("abc12345");
        driver.findElement(By.name("inputPassword")).sendKeys("hello12345");
       // driver.findElement(By.name("chkboxOne")).click();
       // driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@email.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc123@gmail.com");
        //driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("lunaspud@gmail.com");
        //driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("07498365463");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("074772266354");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.xpath("//form/p[1]")).getText());
        //driver.close();


    }
}
