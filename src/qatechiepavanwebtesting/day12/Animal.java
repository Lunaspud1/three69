package qatechiepavanwebtesting.day12;

public class Animal {

    String color = "white";

    void eat()
    {
        System.out.println("eating .....");
    }
}


class Dog extends Animal
{
    String color = "black";

    void dogeatingornot()
    {
        System.out.println(super.color);
        //super.eat();
    }

    void eat()
    {
        System.out.println("eating bread");
        //super.eat();
    }
}


