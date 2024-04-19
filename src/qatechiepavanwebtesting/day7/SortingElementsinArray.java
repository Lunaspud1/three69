package qatechiepavanwebtesting.day7;

import java.util.Arrays;


public class SortingElementsinArray {
    public static void main(String[] args) {

        //declare the arrray then initialize
        int array[]= {30, 10, 50, 40, 20};

        //print the elements of the array
       // for (int i=0; i<array.length; i++){
         //   System.out.println(array[i]);
       // }
        //to print out the elements of an array using Arrays predefined class
       /* System.out.println("Before sorting arrays " + Arrays.toString(array)); //outputs arrays in a list
        Arrays.sort(array); //sorts the elements in the arrays in ascending order
        System.out.println("After sorting arrays " + Arrays.toString(array));
    }

        */
        //string of arrays

    String arr[]= {"hfy","drf","ede","ywf","vft","xsw","taj","dsq"};
    System.out.println("Before sorting strings of array " + Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println("After sorting array of strings " + Arrays.toString(arr));

    }
}
