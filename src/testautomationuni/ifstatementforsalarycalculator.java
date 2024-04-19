package testautomationuni;

import java.util.Scanner;
/*
IF Statement
All sales people get a payment of £1000 a week,
Salespeople who exceed 10 sales get an additional bonus of £250

*/

public class ifstatementforsalarycalculator {

    public static void main (String args []){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int salesquota = 10;

        //Get values for the unknown
        System.out.println("Enter the number of sales made by the employee for the week");
        Scanner scanner = new Scanner(System.in);
        int totalNoOfSales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners and non bonus earner
        if (totalNoOfSales > salesquota){
            salary = salary + bonus;
            //System.out.println("Your Total Salary for the month is: " + (salary + bonus)); remove comment for If Else
        }
        System.out.println(salary);

        //else
          //  System.out.println("Your salary for the month is: " + salary);
    }
}
