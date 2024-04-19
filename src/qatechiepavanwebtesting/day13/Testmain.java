package qatechiepavanwebtesting.day13;

public class Testmain extends Test
{

        public static void main (String args []){

            //create an object of test class in order to access (private variable and method)
            Test t = new Test(); //this is for private, default ad public access modifiers
            //System.out.println(t.m); //unable to access private variable from Test class
            //t.m();  //unable to access private method from Test class

            //default access mdifier
//            System.out.println(t.x); //default variable can be accessed in the same package
//            t.m1(); //default methods can be accessed in the same package with no restrictions

//            //Accessing protected variable and methods from a different package via inheritance
//            Testmain tm = new Testmain();
//            System.out.println(tm.x);
//            tm.m2();

            //public methods can be directly accessed anywhere
            System.out.println(t.y);
            t.m3();
        }
    }
