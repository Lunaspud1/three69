package qatechiepavanwebtesting.day9methods;

public class ParameterizedConstructor {

    int x, y;
    String s;

    ParameterizedConstructor( int a, int b, String str) //parameterized constructor
    {
        x=a;
        y=b;
        s=str;
    }
    void displays()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }

    public static void main (String args []){
        ParameterizedConstructor pm= new ParameterizedConstructor(100, 200, "welcome"); //invoked parameterized constructor

        pm.displays();
    }
}
