package qatechiepavanwebtesting.day13.WrapperClasses;

public class WrapperClass {

    public static void main (String args [])
    {
        //int x =100; //x is a primitive
        //Integer  x= 100;  //here x is an object

        byte b = 10;
        short s = 20;
        int i = 30;
        long k = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'c';
        boolean boo = true;

        //Autoboxing: is when we convert primitive data into objects
        Byte byteobj =b;
        Short shortobj = s;
        Integer intobj = i;
        Long lonobj = k;
        Float floatobj = f;
        Double doubleobj =  d;
        Character charobj = 'c';
        Boolean booleaobj = boo;

        //printin objects after conversion using wrapper class
        System.out.println("Printing object values----");
        System.out.println("Byte object " + byteobj);
        System.out.println("Short object " + shortobj);
        System.out.println("int object " + intobj);
        System.out.println("Long object " + lonobj);
        System.out.println("Float object " + floatobj);
        System.out.println("Double object " + doubleobj);
        System.out.println("Character object " + charobj);
        System.out.println("Boolean object " + booleaobj);

        //Unboxing: is converting objects back to primitive types

        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = lonobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean booleanvalue = booleaobj;

        //printing primitives
        System.out.println("_________________________");
        System.out.println("bytevalue = " + byteobj);
        System.out.println("shortvalue = " + shortvalue);
        System.out.println("intvalue = " + intvalue);
        System.out.println("longvalue = " + longvalue);
        System.out.println("floatvalue = " + floatvalue);
        System.out.println("doublevalue = " + doublevalue);
        System.out.println("char value = " + charvalue);
        System.out.println("boolean value = " + booleanvalue);
    }
}
