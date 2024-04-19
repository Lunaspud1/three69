package qatechiepavanwebtesting.day10;

public class StaticExample {

    static int a=10; //Static variable
    int b=20; //not static variable

    //static method
    static void m1()
    {
        System.out.println("This is m1 static method.....");
    }

    //non-static method
    void m2()
    {
        System.out.println("This is m2 non static method");
    }

    //non-static method can access both static and non-static data
    void m()
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main (String args []){

        //static method can access static data(variable & methods) directly without creating object
        System.out.println(a); //correct
        //System.out.println(b); //incorrect, b is non static, cannot access from static directly
        StaticExample se = new StaticExample(); //through object creation, non-static data (variable and method) can be accessed
        System.out.println(se.b);
        se.m2();
        System.out.println("-----------------------");
        se.m();

    }
}