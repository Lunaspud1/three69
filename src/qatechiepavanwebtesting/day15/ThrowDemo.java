package qatechiepavanwebtesting.day15;

public class ThrowDemo {

    void checkSum(int num)
    {
        if (num <1)
        {
            throw new ArithmeticException("Number is negative, cannot calculate square....");
        }
        else
        {
            System.out.println("Square of num is: " + (num*num));
        }
    }

    public static void main (String args [])
    {
        ThrowDemo td = new ThrowDemo();
        //handle exception if value is lover than 1
        try
        {
            td.checkSum(0);
        }
        catch (Exception e)
        {
            System.out.println("Invalid value provided");
        }


    }
}
