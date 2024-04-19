package qatechiepavanwebtesting.day11;


class parent
{
    int ab = 33;
    void display()
    {
        System.out.println(ab);
    }
}


class child1 extends parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}

class child2 extends parent
{
    void output(int c2)
    {
        System.out.println(c2);
    }
}

public class heirarchyinheritance {

    public static void main (String args []){

        child1 c1=new child1();
        child2 c2= new child2();
        System.out.println(c1.ab);
        c1.display();;
        System.out.println(c2.ab); //from parent class
        c2.output(33);

    }
}
