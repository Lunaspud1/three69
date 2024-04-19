package qatechiepavanwebtesting.day11;

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }

    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC
{
    void m1(int a)   //overidden method
    {
        System.out.println(a*a);
    }
    void m2( int a, int b)
    {
        System.out.println(a + b);   //overloaded method
    }
}

public class overloadingvoverriding {

    public static void main (String rgs []){

        XYZ ob = new XYZ();
        ob.m1(10);  //100
        ob.m2(66);
        ob.m2(32, 6);


    }
}
