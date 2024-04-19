package testautomationuni;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class SwitchCase {

    public static void main (String args []) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String letterGrade = scanner.next();

        String message;

        switch (letterGrade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh Oh";
                break;
            default:
                message = "This is not a valid grade";
        }
        System.out.println(message);
    }
}
