package qatechiepavanwebtesting.day6;

public class day6SingleDimArrays {
    public static void main(String args[]) {

        //1. Declare an array

        //Approach 1
        /*
        int a[]= new int[5];  //declaration

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        System.out.println(a[4]);
        */

        //Approach 2
        int array[] = {100, 200, 300, 400, 500}; //data declaration and insertion

        //3. find the size of an array
        //System.out.println(array.length);  //will return the length of an array

        //How to read specific value from array
        System.out.println(array[3]);  //outputs 400
        System.out.println("****************************");

        //How to read multiple values from an array (using for loop)
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("***************");
        //enhanced for loop
        for (int x:array){
            System.out.println(x);
        }




    }
}
