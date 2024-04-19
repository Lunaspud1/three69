package qatechiepavanwebtesting.day9methods;

import java.awt.*;

public class ConstructorPractice {

    int x, y;
    String s;

    //Constructor does not return any value and has the same name as the class, it's used to assign data into variable
    ConstructorPractice()  //when a constructor does not take any parameter it's called a default constructor
    {
        x=10;
        y=20;
        s="welcome";
    }
    //to print all the vvariable values
    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }

    //to use the constructors we have to create an object of the default constructor
    public static void main (String args []){
        ConstructorPractice cp = new ConstructorPractice();
        cp.display();
    }
}
