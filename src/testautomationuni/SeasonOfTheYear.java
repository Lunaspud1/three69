package testautomationuni;

import java.util.Scanner;


public class SeasonOfTheYear {

    //FollowUp Assignment
    public static void main (String args []){

        //1. Season of the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Season of the year");
        String season = scanner.next();

        //2. Enter a whole number
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

        //3. Enter an adjective
        System.out.println("Enter an Adjective e.g. Snowy, Rainy, or Sunny");
        String weather = scanner.next();
        scanner.close();

        //4. Season, month and weather of the year
        System.out.println("On a " + weather + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");


    }
}
