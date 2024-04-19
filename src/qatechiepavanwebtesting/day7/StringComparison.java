package qatechiepavanwebtesting.day7;

public class StringComparison {

    public static void main (String args []){

      /*  String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2); //output should be true
        System.out.println(s1.equals("welcome")); //should output true

       */

        String s1 = new String("welcome");
        String s2 = new String("Welcome");
        System.out.println(s1==s2); //false   == here compares the objects
        System.out.println(s1.equals(s2));  //true  .equals() here compares the values

        String s3=s1;

        System.out.println(s1==s3);  //should output true
        System.out.println(s1.equals(s3));  //Should output true

        ///////////////////////////////

        String x = "abc";
        String y = new String ("abc");
        System.out.println(x==y); //should output false
        System.out.println(x.equals(y));   //should output true
    }
}
