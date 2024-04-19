package qatechiepavanwebtesting.day11;

class A
{
    int a =100;
    void display()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int b = 500;
    void show()
    {
        System.out.println(b);
    }
}

public class singleinheritance {

    public static void main (String args []){

        B bobj = new B();
        System.out.println(bobj.a + bobj.b);
        System.out.println(bobj.b);
        bobj.show();
        bobj.display();


    }
}
