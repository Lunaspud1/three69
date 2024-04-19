package testautomationuni;

import java.util.Scanner;

/*
Display a letter grade for a student, based on their test score.
 */
public class ifelseif {
    public static void main(String args[]) {

        //Get your test score
        System.out.println("Enter the test score you acquired:");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if (testScore < 60) {
            grade = 'F';
        }
        else if (testScore < 70){
            grade = 'D';
        }
        else if (testScore < 80){
            grade = 'C';
        }
        else if (testScore < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade for the test carried out is : " + grade);


    }
}