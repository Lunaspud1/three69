package qatechiepavanwebtesting.Practices;

public class practiceandretries {
    public static void main(String args[]) {

        //declare and store elements into the array
        int array[] = {50, 30, 20, 10, 240};

        //find 10 from the array; by comparing 10 with the values in the array
        int num = 39;

        boolean status = false;

        //for loop
 /*       for (int i = 0; i < array.length; i++)
            if (array[i] == num) {
                System.out.println("Element is successfully found in the array");
                status = true;
                break;
            }
        if (status == false) {
            System.out.println("Element is not found in the array");
        }
    }

  */

        //enhanced for loop

        for (int x:array) {
            if (x == num) {
                System.out.println("Element is succesfully found in the array");
                status = true;
                break;
            }
        }
        if (status==false)
        {
            System.out.println("Element is not found in the array");

        }
              }
}

