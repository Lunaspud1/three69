package qatechiepavanwebtesting.day9methods;

public class MethodOverloading {

    //create some variables (global variables)
    int x,y,z;
    double d;

    //method taking no parameter
    void sum()
    {
        x=10;
        y=20;
        System.out.println(x+y);
    }

    //method can be of the same name as above but taking 2 parameters (method overloading)
    void sum(int a, int b)
    {
        x=a;
        y=b;
        System.out.println(x+y);
    }

    //same as above but taking 2 parameter but one of double data type
    void sum(int a, double b)
    {
        x=a;
        d=b;
        System.out.println(x+d);
    }

    //methods of the same name but now with 3 parameters
    void sum(int a, int b, double c)
    {
        x=a;
        y=b;
        d=c;
        System.out.println(x+y+d);
    }

    //main method can also be overloadable, but it must be defined differently i.e. no parameter or different parameter
    void main()
    {System.out.println("This is my own main method.......");}

    public static void main (String args []){

        //call the methods outside main methods by creating object of the class
        MethodOverloading mo = new MethodOverloading();

        //mo.sum();
        //mo.sum(27, 33);
        mo.sum(43, 87.5);
        mo.sum(34, 14, 12.98);
        //mo.sum(33.6, 34); //error coz there is no implementation with ths combination
        //mo.sum(43.6, 23); //error because parameters are not in the right order
        //calling main method
        mo.main();//overloaded main method




    }
}
