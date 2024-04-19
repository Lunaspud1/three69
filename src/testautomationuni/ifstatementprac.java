package testautomationuni;


import java.util.Scanner;

/*
IF Statement
All sales people get a payment of £1000 a week,
Salespeople who exceed 10 sales get an additional bonus of £250
*/
public class ifstatementprac {

    public static void main (String args []){

        int salary = 1000;
        int bonus = 250;
        int salesquota = 10;

        System.out.println("Enter total number of sales made by employee for the week");
        Scanner scanner = new Scanner(System.in);
        int totalNoOfSales = scanner.nextInt();
        scanner.close();

        if (totalNoOfSales > salesquota){
            salary = salary + bonus;
        }
        System.out.println("Your Total salary for the week is: " + salary);
    }
}
