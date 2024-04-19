package qatechiepavanwebtesting.day7;

public class StringMethods {
    public static void main (String args []){

        String s = "welcome";
        System.out.println(s);

        //length method can be used toreurn the lenght of a string
        System.out.println(s.length());
        int len = s.length();

        //concat()  - is used to join strings
        System.out.println(1+2);
        System.out.println("abc" + "xyz");
        System.out.println(1 + "xyz");
        System.out.println("###########################");

        //concat
        String s1 = "xyz";
        String s2 = "abc";
        String s3 = "lmk";

        System.out.println(s1.concat(s2));
        //or
        //System.out.println("xyz".concat("abc"));
        System.out.println(s1.concat(s2).concat(s3));

        //trim() - trim the spaces to the left and right of a variable
        s = "    automation    ";
        System.out.println(s);
        System.out.println("Before trimming " + s.length());
        System.out.println("After trimming " + s.trim().length());

        //charAt() - returns a single character based on the index
        s="welcome";
        System.out.println(s.charAt(5));//m
        System.out.println(s.charAt(0));//w

        //contains()  - returns a boolean value true/false
        s="selenium";
        System.out.println(s.contains("ium"));
        System.out.println(s.contains("IuM"));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        //equals() and equalsIgnoreCase()   compare the two strings and return true/false
        s1="WELCOME";
        s2="welcome";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //replace()  replaces single/multiple/sequence of characters n a string
        s="welcome to Selenium automation testing welcome to Selenium automation testing";
        System.out.println(s.replace('m', 'Z'));  //welcoZe to SeleniuZ autoZation testing
        System.out.println(s.replace("Selenium", "Java"));

        //substring() - extract substring of the main string
        s="Selenium";
        System.out.println(s.substring(0, 3));  //sel
        System.out.println(s.substring(4, 8)); //nium
        System.out.println(s.substring(1, 3)); //el

        //toUpperCase() && toLowercase
        s="WELcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //split() - divided the string into multiple parts based on delimeter/separator (space, comma, asterisk or any other symbol)

        //s="abc xyz";
        s="abc@xyz@lmn";


        //split the above string into two strings and returns two strings
        //String var[] = s.split(" ");
        String var[] = s.split("@");
        //extract thr first string
        System.out.println(var[0]);
        //then the second string
        System.out.println(var[1]);
        System.out.println(var[2]);





    }

}
