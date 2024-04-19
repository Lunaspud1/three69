package qatechiepavanwebtesting.day16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main (String args [])
    {
        //declaration
        //HashMap hm = new HashMap();
        //to explicitly specify the data type of key and value
        //HashMap<Integer, String> hm = new HashMap<Integer, String>();
        Map hm = new HashMap();

        //adding data into hashmap. here we use put method
        hm.put(101, "John");
        hm.put(102, "Davis");
        hm.put(103, "Smith");
        hm.put(104, "Mary");
        hm.put(105, "John");
        hm.put(105, "Michael"); //duplicate key is not allowed

        System.out.println(hm); //{101=John, 102=Davis, 103=Smith, 104=Mary, 105=Michael}

        //size
        System.out.println(hm.size());

        //to remove a pair
        hm.remove(101); //Key
        System.out.println("After removing a pair we have: " + hm);

        //Get the value from a specific key
        System.out.println(hm.get(104));  //Mary

        //print only keys from Hashmap
        System.out.println(hm.keySet()); //[102, 103, 104, 105]

        //get all the values from Hashmap (using looping statement)
        for (Object k:hm.keySet())
        {
            System.out.println(hm.get(k));
        }
System.out.println("______________________________");
        //print key and value pairs individually
        for (Object k : hm.keySet())
        {
            System.out.println(k+"    " + hm);
        }

        //clear
        hm.clear();System.out.println(hm); // {}



    }
}
