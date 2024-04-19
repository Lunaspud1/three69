package testautomationuni;

/*Nested If,
To qualify for a loan a person must make at least £30,000
and have been working at their current job for at least 2 years
*/

import java.util.Scanner;

public class loanQualifierNestedIf {
    public static void main(String args[]) {

        //Initialize what we know
        int min_Salary = 30000;
        int min_Years_Worked = 2;

        //Get what we dont know
        System.out.println("How many years duration have you been employed for");
        Scanner scanner = new Scanner(System.in);
        int years_employed = scanner.nextInt();

        System.out.println("How much is your yearly Salary");
        double salary = scanner.nextDouble();

        scanner.close();

        //Make a decision1
        if (years_employed >= min_Years_Worked) {
            if (salary >= min_Salary) {
                System.out.println("You have successfully qualified to apply for a loan");
            } else {
                System.out.println("Sorry! You must have worked at least: " + min_Years_Worked + " years and earn at least: £" + min_Salary + " to qualify for a loan");
            }
        }
    }
}
