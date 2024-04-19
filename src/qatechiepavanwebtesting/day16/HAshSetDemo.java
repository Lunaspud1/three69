package qatechiepavanwebtesting.day16;

import java.util.HashSet;

public class HAshSetDemo {

    public static void main (String args [])
    {
        HashSet myset = new HashSet(); //This is correct
        //Set myset = new HashSet(); //This is correct
        //Set <Integer> restrict = new HashSet<Integer>(); //to convert HashSet into accepting only integer values via wrapper class


        //add elements into set
        myset.add(100);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add(true);
        myset.add("Welcome");
        myset.add(true);
        myset.add(null);
        myset.add(100); //duplicate are not allowed
        myset.add(null);  //multiple nulls are not allowed

        System.out.println(myset);  //[null, 100, 10.5, Welcome, true], outputs in no specific order

        //remove value from set
        myset.remove(null);  //directly specify the value
        System.out.println(myset);  //[100, 10.5, Welcome, true]

        //Not possibe to insert new values due to no support for indexing not being supported by Hashset

        //retrieve a value from the hashset via using looping statement (enhanced for loop)
        for (Object x : myset)
        {
            System.out.println(x);
        }
        //to remove all elements from the hashset
        myset.clear();
        System.out.println(myset); //[]


    }
}
