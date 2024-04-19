package qatechiepavanwebtesting.day13;

import java.util.Scanner;

public class TakingDataFromKeyboard {

    public static void main(String args[]) {
        //parsing data from keyboard
        //create an object of scanner class
        Scanner sc = new Scanner(System.in);
        //enter data type to be input from keyboard then sc
//        System.out.println("Enter a number");
//        int x = sc.nextInt();//only for interger types
//        System.out.println(++x);
        //double
//        System.out.println("Enter a decimal number");//double
//        double y = sc.nextDouble();//for doubles
//        System.out.println(y-y);

//        //String types
//        System.out.println("Enter a string value:");
//        String scan_demo= sc.next();
//        System.out.println(scan_demo.length());

//        //Taking multiple inputs
//        System.out.println("Enter the first data");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the second data");
//        int y = sc.nextInt();
//
//        System.out.println("Enter the third data");
//        int c = sc.nextInt();
//
//        System.out.println("The sum of three number is: " + (a+y+c));

//        //Taking the input into an array
//
//        int a[] = new int[5];
//        System.out.println("Enter first value into array");
//        a[0]= sc.nextInt();
//
//        System.out.println("Enter second value into array");
//        a[1]= sc.nextInt();
//
//        System.out.println("Enter third value into array");
//        a[2]= sc.nextInt();
//
//        System.out.println("Enter fourth value into array");
//        a[3]= sc.nextInt();
//
//        System.out.println("Enter fifth value into array");
//        a[4]= sc.nextInt();
//
//        //printing values from array
//        //for (int i=0; i<a.length; i++)// incorrect
//        for (int x:a)
//        System.out.println(x);

        //Taking many values into array using looping statement
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter " + i + " value");
            a[i] = sc.nextInt();
        }
        //printing values from array
        for (int x:a) {
            System.out.println(x);
        }
    }
}
