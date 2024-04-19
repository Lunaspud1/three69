package qatechiepavanwebtesting.day9methods;

public class ThisKeyword {

    // create two int variables
    int x, y;   // variables declared under a class are global variables/instance variables (can be accessed under every method created inside a class)

    //assign data into the variables taking 2 paramaters
    void setData(int a, int b) //local variable
    {
        //if we want to specify global variable and local variable ith the same name we have to differentiate them by using this keyword
        //x=x;
        //y=y;
        this.x=x; //this.x belongs to the class/global variable
        this.y=y; //this.y belongs to the class/global variable
    }

    //dislay the data of x and y
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main (String args [])
    {
        //Access the objects above by creating objects of the class
        ThisKeyword tk = new ThisKeyword();
        tk.setData(10,20);
        tk.display(); //outputs 10, 20
    }
}
