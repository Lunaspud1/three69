package qatechiepavanwebtesting.day14;

//abstract class, have to explicitly specify abstract keyword
abstract class Wild_Animals {
    abstract void eat();  //abstract method (unimplemented method)

//non-abstract methods are allowed i.e. normal method.....default methods in (interface)
    void run() //
    {
        System.out.println("Runs fast ....");
    }
    //static method
    static void sleep()
    {
        System.out.println("Sleeps.....");
    }
    //constructors are also allowed in abstraction
    Wild_Animals()
    {
        System.out.println("This is a constructor....");
    }
}
//child class extends abstract class in order to inherit properties from abstract class
class horse extends Wild_Animals
{
     void eat()
    {
        System.out.println("Eating grass....");
    }
}

public class AbstractClassDemo {
    public static void main(String args[]) {

        //create object/reference variable of child class to inherit properties of abstract class
        //AbstractClassDemo ab= new AbstractClassDemo(); // this is incorrect
        Wild_Animals wa = new horse(); //this is correct OR
        //horse wa = new horse();
        wa.eat();
        wa.run();

        //static method can be called directly from main(static) by using classname_static_method name

        Wild_Animals.sleep();

        //Constructors are instantiated at object creation


    }
}