package testautomationuni;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String [] args){

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;
        scanner.close();

        //4. Display the result
        System.out.println("Employee's Total Grosspay per month is: £" + grossPay);



    }
}
