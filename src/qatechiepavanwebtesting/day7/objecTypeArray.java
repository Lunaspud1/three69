package qatechiepavanwebtesting.day7;

public class objecTypeArray {

    //object arrays can store multiple data of any data type i.e. heterogenous data

    public static void main(String args[]) {

        Object array[] = new Object[5];

        array[0] = 50;
        array[1] = "cars";
        array[2] = 'm';
        array[3] = 30.78;
        array[4] = true;

        //normal for loop to read data from object array
        // for (int  i=0; i<array.length; i++){
        //   System.out.println(array[i]);

        //enhanced for loop
        for (Object x:array) {
            System.out.println(x);
        }
        {


        }
    }
}
