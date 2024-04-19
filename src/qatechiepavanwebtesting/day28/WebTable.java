package qatechiepavanwebtesting.day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTable {
    public static void main(String args[]) {
        //System.setProperty("webdriver.gecko.driver", "/home/ademiju/Webdrivers/geckodriver/");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //How to find total number of rows in a table (using xpath)
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        //if we have only a single table on the web page (use tagname)
        //int rows = driver.findElements(By.tagName("tr")).size();
        System.out.println("Total Number of rows on the web table is: " + rows);

        //find number of table header on the web page
        int table_Columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Total number of columns on the web table is: " + table_Columns);

        //Retrieve specific data/value from table
        String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(value);

        //Retrieve all the data from the table
        /*for (int r=2; r<=rows; r++)  //2,3,4
        {
            for (int c=1; c<=table_Columns; c++)
            {
                //parameterize values into xpath
                String allTableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(allTableData+ "            ");   //for formatting
            }
            System.out.println();
        }

         */

        //Print the book name whose author is Amit from 2nd row
        /*for (int r=2; r<=rows; r++) {
            String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")).getText();
            //System.out.println(author);
            if (author.equals("Amit"))
            {
                String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
                System.out.println(bookname+"        "+author);
            }

         */

            //Find the total cost of all books on the table
        int sum=0;
            for (int r=2; r<=rows; r++)
            {
            String price =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
            //System.out.println(price);
                sum=sum+Integer.parseInt(price);
        }
            System.out.println("Total price of books: " + sum); //7100

            driver.quit();
        }
    }
