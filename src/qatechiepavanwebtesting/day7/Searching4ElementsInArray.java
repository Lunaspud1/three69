package qatechiepavanwebtesting.day7;

public class Searching4ElementsInArray {
    public static void main(String args[]) {

        //declare and store elements into the array
        int array[] = {50, 30, 20, 10, 240};

        //find 10 from the array; by comparing 10 with the values in the array
        int num = 20;

        boolean status = false;

        // Using for loop
        for (int i = 0; i < array.length; i++) {
            //instead of printing, compare using if condition
            if (array[i] == num) {
                System.out.println("Element is successfully found in the array");
                //break the loop once element is found
                status = true;
                break;

            }
        }
        //if element is not matching with any values in the array
        if (status == false)
        {
            System.out.println("Element not found");
        }


        //Using enhanced for loop
     /*   for (int x : array) {
            if (x == num) {
                System.out.println("Element is found in the array");
                status = true;
                break;
            }
        }
        if (status = false) {
            System.out.println("Element is not found in the array");
        }
    }
      */
    }
    }