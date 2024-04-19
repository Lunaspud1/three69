package qatechiepavanwebtesting.day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {


    public static void main (String args [])
    {
        //declaration
        //ArrayList mylist = new ArrayList(); //1 type of declaration
        List mylist = new ArrayList();  //2nd type of declaration via List interface (parent interface of Arraylist class)
        //ArrayList <Integer> restrict= new ArrayList<Integer>();  //we can use wrapper class to restrict array list to accepting only one type of data e.g. (homogeneous) Integer

        //add data elements into arraylist
        mylist.add(100);
        mylist.add("Welcome");
        mylist.add('d');
        mylist.add(true);
        mylist.add(null);
        mylist.add(20.5);
        mylist.add(null); //multiple nulls are allowed
        mylist.add(200);

        //print the size of an array
        System.out.println(mylist.size()); //8

        //Display values from arraylist -- Insertion order is preserved
        System.out.println(mylist);  // [100, Welcome, d, true, null, 20.5, null, 200] --duplicate elements are allowed

        //to remove some values from arraylist
        mylist.remove(5); //here 5 is index of 20.5
        System.out.println("After removing element from array: " + mylist);  //[100, Welcome, d, true, null, null, 200]

        // To add new values at the end of the list
        mylist.add(false);
        mylist.add(50.25);
        System.out.println("After 2 more objects added to array now we have: " + mylist);  //[100, Welcome, d, true, null, null, 200, false, 50.25]

        //Inserting values in the middle of the list
        mylist.add(3, "Java");  //add(index, value)
        mylist.add(6, "Selenium"); //add(index, value)
        System.out.println("After inserting new objects into arraylists: " + mylist);  //[100, Welcome, d, Java, true, null, Selenium, null, 200, false, 50.25]

        //to read/retrieve the specific value from arraylist
        System.out.println(mylist.get(3)); //indev value of object to be retrieved

        //reading all the values from arraylists (enhanced for loop)
        for (Object x:mylist)  //have to declare the type of variable of x (object variable)
        {
            System.out.println(x);
        }

//        //clear arraylists
//        mylist.clear();
//        System.out.println("After clearing arraylist: " + mylist);  //[]

        //to replace an existing value into arraylist
        mylist.remove(2);
        mylist.add(2, 'z');
        System.out.println("After replacing existing value in the arraylist: " + mylist);


    }
}
