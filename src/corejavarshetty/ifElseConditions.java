package corejavarshetty;

public class ifElseConditions {
    public static void main(String args[]) {
        //prints out values divisible by 2 without any remainder
        int[] alpha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};
        for (int i = 0; i < alpha.length; i++)
            if (alpha[i] % 2 == 0) {
                System.out.println(alpha[i]);
            } else {
                System.out.println(alpha[i] + " is not divisible by 2");
            }

        int[] booking = {20, 25, 30, 35, 40, 45, 50, 55, 1000};
        for (int i =0; i < booking.length; i++)
         if (booking[i] % 2 == 0)
         {
             System.out.println(booking[i]);
             break; //will exit for loop
         }
         else
             System.out.println(booking[i] + "is not divisible by 2");


    }
}