package qatechiepavanwebtesting.day12.interfaceconcept;

interface shape
{

    int length=10;  //this is final and static in interface
    int width=20;  //final and static

    void circle();   //this is an abstract method in an interface (no implementation) also public by default

    //void square() //not allowed to write methods like this in an interface
    default void square() //default method
    {
        System.out.println("This is a square default method");
    }

    static void rectangle() //static method
    {
        System.out.println("This is rectangle static method");
    }
}


public class InterfaceDemo implements shape
{
    //implementing abstract void method
    //void circle()  //this is looked at as a default method in this class, default access modifier is also less than public, (resolve by adding public to the method)
    public void circle()
    {
        System.out.println("This is circle abstract method");
    }

    public static void main (String args []) {

        // shape sh = new shape() ///this is incorrect we cant instantiate an interface
        //shape sh = new InterfaceDemo();  //or
        InterfaceDemo sh = new InterfaceDemo();
        sh.circle();
        sh.square();
        shape.rectangle(); ///direct access because this is static method
        System.out.println(shape.length);
        System.out.println(shape.width);

        }
    }