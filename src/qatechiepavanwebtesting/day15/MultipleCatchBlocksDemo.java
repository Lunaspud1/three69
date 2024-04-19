package qatechiepavanwebtesting.day15;

import java.util.Scanner;

public class MultipleCatchBlocksDemo {

    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();

        //1st approach if we dont know what type of exception

        /*try
        {
            System.out.println(100/num);
        }
        catch (ArithmeticException a) // if statement throws arithmetic exception then arithmetic exception catch will handle
        {
            System.out.println("You have entered an invalid input....");
        }
        catch (ArrayIndexOutOfBoundsException a) //if statement throws Array Index Out Of Bounds Exception then Array Index Out Of Bounds exc. catch will handle
        {
            System.out.println("You have entered an invalid number");
        }
        catch (IndexOutOfBoundsException a)
        {
            System.out.println("You have entered an invalid number");
        }
        catch (NumberFormatException a)
        {
            System.out.println("You have entered an invalid number");
        }


         */

        try
        {System.out.println(100/num);
        }
            catch(Exception e) //all types of exception thrown by the try block will be handled by this catch block
            {
                System.out.println("You have entered an invalid input");
        }
        System.out.println("Program is complete...");
        System.out.println("Program have exited");
    }
}
