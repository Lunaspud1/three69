package qatechiepavanwebtesting.day6;

public class TwoDimensionalArrays {

    public static void main(String args[]) {

        //declaration
        //Approach 1
        int array[][] = new int[3][2];  //declaration

        //initialization or assignment
        array[0][0] = 100;
        array[0][1] = 200;
        array[1][0] = 300;
        array[1][1] = 400;
        array[2][0] = 500;
        array[2][1] = 600;
        System.out.println(array.length);

        System.out.println("#################");

        //Approach 2
        int arr[][] = {{100, 200}, {300, 400}, {500, 600}}; //initialization or assignment

        //Size of a 2.D. array (rows)
        System.out.println(array.length);
        //find number of columns
        System.out.println(array[0].length);

        //How to read a specific value from a 2.D. array
        System.out.println(array[2][0]); //500
        System.out.println(array[1][1]);//400
        System.out.println("#########################");

        //Reading all the values from 2d array (nested looping)
        /*for (int r = 0; r < arr.length; r++)  // 6
        {
            for (int c = 0; c < 2; c++) //1
            {
                System.out.println(arr[r][c]);
                */
         //Enhanced for loop
        for ( int x[]:arr)
        {
            for (int v:x)
            {
                System.out.println(v);
            }
        }
    }
}