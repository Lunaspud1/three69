package qatechiepavanwebtesting.day11;

class C
{
    int c=200;
    void output(int c)
    {
        System.out.println(c);
    }
}

class D extends C
{
    int d = 1000;
    void new_display(int d)
    {
        System.out.println(d);
    }
}

class E extends D
{
    int e = 700;
    void output_log()
    {
        System.out.println(e);
    }
}

public class multilevelinheritance {

    public static void main (String args []){

        D objc = new D();
        E objc1 = new E();
        System.out.println(objc.c);
        System.out.println(objc.d);
        System.out.println(objc1.e);
        System.out.println("________________________________");
        objc.output(23);   //from C class
        objc.new_display(44);  //from D class
        objc1.new_display(23);
        objc1.output(33); //from C class
        objc1.new_display(21);  //from D class
        objc1.output_log();   //from E class


    }
}
