package qatechiepavanwebtesting.day9methods;

public class ConstructorDemo {
    //Constructor is used for initializing data into a variable
    int x, y;
    String s;
    //default constructor does not take any parameters
    ConstructorDemo()
    {
        System.out.println("Default constructor is executed....");
    }

    //parameterised Constructor
    ConstructorDemo(int a, int b, String str)
        {
            //will assign the data into a, b and String variables
            x=a;
            y=b;
            s="str";
        }
        //create a method to print out the data in the constructor
    void display()
    {
        System.out.println(x+"    "+y+"    "+s);
    }

    public static void main (String args [])
    {
        //create an object or ConstructorDemo
        //ConstructorDemo cd = new ConstructorDemo();// Default construtor is executed....
        ConstructorDemo cd = new ConstructorDemo(100, 300, "welcome");//constructor is invoked at object creation
        //explicitly call the parameterized method
        cd.display();//call display method
    }
}
