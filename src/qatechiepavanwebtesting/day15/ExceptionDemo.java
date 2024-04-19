package qatechiepavanwebtesting.day15;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main (String args []) {
        System.out.println("Program have started...");
        System.out.println("Program is in progress ...");

        //Arithmetic exception

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ....");
        int val = sc.nextInt();
        System.out.println(100/val); //enter 0 into system, then this should output Arithmetic Exception

       */
        //array, for ArrayIndexOutOFBoundsException
        /*int a[] = new int[5];  //0...4
        Scanner sc=new Scanner(System.in); //takes input from user
        System.out.println("Enter a number ....");
        int val = sc.nextInt();
        //what position to enter the value into array
        System.out.println("Enter a position");
        int pos = sc.nextInt(); //Enter a number where to store initial value entered, (i.e. 5 for out of bounds exception)
        //store position into array
        a[pos] = val;
        System.out.println(a[pos]);
         */

        //Number format exception
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.next();
        //Convert String into integer via wrapper class
        int num = Integer.parseInt(str);


        System.out.println("Program is completed...");
        System.out.println("Program is exited...");


    }

}
