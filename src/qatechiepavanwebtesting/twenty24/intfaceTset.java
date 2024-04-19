package qatechiepavanwebtesting.twenty24;

public interface intfaceTset {

    interface Shape {
        int lenght = 10;  //final and static variable declaration
        int width = 20;   //final and static variable declaration

        void circle();  //abstract method

        default void square() {
            System.out.println("This is default method for square method");
        }

        static void rectangle() {
            System.out.println("This is a static methof for retangle method");
        }
    }

        public class interfaceTest implements Shape
        {
            void triangle()
            {
                System.out.println("This is a triangle method");
            }

            public void circle()
            {
                System.out.println("Ths is an abstract method for circle");
            }

            public static void main(String[] args) {

                //Sceario 1
                interfaceTest iTest=new interfaceTest();
                iTest.triangle();  //normal method
                iTest.square();  //default method
                iTest.circle();  //abstract method
                // iTest.rectangle();   /not valid
                Shape.rectangle();   //static method can be directly accessed from interface

                System.out.println("---------------------------------------------------");
                //Scenario 2
                //Shape sh = new Shape(); //This is valid because we cannot create an object for an interface, only a variable e.g. sh
                Shape sh=new interfaceTest();  //valid

                System.out.println("---------------------------------------------------");

                //sh.triangle();  //not valid bcoz triangle method belongs to class
                sh.circle();  //abstract
                sh.square(); //default method
                Shape.rectangle();

                }
            }
        }
