package qatechiepavanwebtesting.day13.WrapperClasses;


public class DataConversionMethods {

    public static void main (String args []) {
        //String to integer
        String s = "welcome";   //cannot convert to integer coz it contains alphabets
        String s1 = "10";  //ths is treated as a string
        String s2 = "20"; //this is a string (s1+s2 will output 1020)

        //now convert string to number using Integer wrapper class then perform an arithmetic on the integer
        int s1num = Integer.parseInt(s1);
        int s2num = Integer.parseInt(s2);
        //not do the addition of both variables
        System.out.println(s1num + s2num); //should output 30


        //String to double
        String d1 = "150.50";
        String d2 = "200.25";

        //convert the string to double using double wrapper class
        double d1to_dbl = Double.parseDouble(d1);
        double d2to_dbl = Double.parseDouble(d2);
        //now add the double to output as double datatype
        System.out.println(d1to_dbl + d2to_dbl);


        //String to boolean

        String status = "true";
        String status1 = "false";
        //convert to Boolean using Bolean wrapper class
        boolean bln1 = Boolean.parseBoolean(status);
        boolean bln2 = Boolean.parseBoolean(status1);

        System.out.println(bln1);
        System.out.println(bln2);
        System.out.println("___________________________________");


        //int, double, char and boolean  to String

        int a=10;
        double d= 40.98;
        char c = 'S';
        boolean t =true;

        //convert from primitive data type to String type

        String new_int = String.valueOf(a);
        String new_double = String.valueOf(d);
        String new_char = String.valueOf(c);
        String new_bool = String.valueOf(t);

        System.out.println(new_int);
        System.out.println(new_double);
        System.out.println(new_char);
        System.out.println(new_bool);




    }

}