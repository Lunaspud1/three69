package qatechiepavanwebtesting.day12;

public class TestSuper {

    public static void main (String args [])
    {
        Dog dg = new Dog();
        System.out.println(dg.color);  //should output black dog is eating some bred
        dg.eat();  //should output
        System.out.println(dg.color);  //shout output eating......
        dg.dogeatingornot();
    }
}
