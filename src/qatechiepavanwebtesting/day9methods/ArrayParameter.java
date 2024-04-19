package qatechiepavanwebtesting.day9methods;


//How to pass array as an argument in a method

public class ArrayParameter {
    String names[] = new String[3];

    void setData(String arr[])
    {
        for (int i=0; i<arr.length; i++){
            //copy data from arr to names
            names[i]=arr[i];
        }
    }
    //print the data from the array above
    void displayData()
    {
        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);

        }
    }

    public static void main (String args []){

        String n[] = {"abc", "xyz", "qpr"};

        ArrayParameter ap =new ArrayParameter();
        ap.setData(n);

        //print array data
        ap.displayData();
    }



}
