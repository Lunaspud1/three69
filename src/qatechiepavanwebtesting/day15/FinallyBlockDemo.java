package qatechiepavanwebtesting.day15;

import java.util.Scanner;

public class FinallyBlockDemo {



    public static void main (String args [])
    {
        //ArrayIndexOutOFBoundsException
        int a[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value...");
        int num= sc.nextInt();
        System.out.println("Enter position");
        int pos = sc.nextInt();


        try
        {
        a[pos] = num;
        System.out.println(a[pos]);
        }
        catch (Exception e)
        //catch (ArithmeticException e)//exception not handled
        {
            System.out.println("Exception occured and handled...");
        }
        finally {// finally block is always optional
            System.out.println("Entered into finally block...");
        }
        System.out.println("Program completed");
        System.out.println("Program exited");
    }
}
