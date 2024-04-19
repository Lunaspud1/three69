package testautomationuni;


import java.util.Scanner;

/*IF Else
All salespeople are expected to make at least 10 sales each week,
for those wo do, they receive congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */
public class ifelse {

    public static void main (String args []){

        int salesQuota = 10;

        System.out.println("Enter the number of sales made for the week");
        Scanner scanner = new Scanner(System.in);
        int noOfSales = scanner.nextInt();
        scanner.close();

        if (noOfSales >= salesQuota){
            System.out.println("The management will like to send you CONGRATULATIONS on meeting the minimum amount of sales for the week!");
        }
        else{
        int salesShortBy = salesQuota-noOfSales;
        System.out.println("Sorry! You have not met the sales quota for the week, you were short by " + salesShortBy + " sales");
        }

    }

}
