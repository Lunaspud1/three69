package qatechiepavanwebtesting.day9methods;

public class ConstructorOverloading {

    int x, y;
    double d;

    //constructor must have the same name as class name
    //constructor with no parameter/argument
    ConstructorOverloading()    //1
    {
        x=10;
        y=20;
        System.out.println(x+y);
    }

    //constructor method with 2 paramaters
    ConstructorOverloading(int a, int b)     //2
    {
        x=a;
        y=b;
        System.out.println(x+y);
    }

    //constructors with 3 parameters
    ConstructorOverloading(int a, int b, double db)   //3
    {
        x=a;
        y=b;
        d=db;
        System.out.println(x+y+d);
    }

    //constructor method with 4 parameters    //4
    ConstructorOverloading(int a, int b, double db, double dbl)
    {
        x=a;
        y=b;
        d=db;
        d=dbl;
        System.out.println(x+y+d+d);
    }

    public static void main (String args []){

        //Constructors are automatically invoked at object creation
        //we cannot call all the constructors at once
        //ConstructorOverloading co = new ConstructorOverloading(); //when executed the first method will be called due to no parameters
        //ConstructorOverloading co = new ConstructorOverloading(32, 88); //second method will be called here
        //ConstructorOverloading co = new ConstructorOverloading(33, 54, 89.4); //third method will be called
        //ConstructorOverloading co = new ConstructorOverloading(32, 87, 23.1, 23.9); //fourth method will be called
    }
}
