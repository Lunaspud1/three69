package corejavarshetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {
    public static void main (String args []){

        ArrayList<String> clubs = new ArrayList<String>();
        clubs.add("liverpoolFC");
        clubs.add("asRoma");
        clubs.add("ssLazio");
        clubs.add("valenciaCF");
        clubs.add("acMilan");
        clubs.add("bayern_Munich");
        clubs.add("manUtd");
        System.out.println(clubs.get(3));

        //for loop to iterate arraylists
        for (int i =0; i <clubs.size(); i++)
            System.out.println(clubs.get(i));
        System.out.println("*******************");
        //enhanced for loop
        for (String allClubs : clubs) {
            System.out.println(allClubs);
        }
        System.out.println("*******************");

        //Check if item is present in Arraylist etc...
        System.out.println(clubs.contains("liverpoolFC"));
        System.out.println(clubs.remove("manUtd"));
        for (int i =0; i<clubs.size(); i++)
            System.out.println(clubs.get(i)); //prints out items in ArrayList excluding manUtd
        System.out.println(clubs.indexOf("valenciaCF"));
        System.out.println("*****************************");

        //convert array to ArrayLists
        String[] s_media = {"Twitter", "Instagram", "Youtube", "Facebook"};
        List<String> s_mediaArrayLists = Arrays.asList(s_media);
        System.out.println(s_mediaArrayLists.contains("Instagram"));

    }
}
