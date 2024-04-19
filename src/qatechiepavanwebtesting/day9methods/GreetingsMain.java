package qatechiepavanwebtesting.day9methods;

public class GreetingsMain {
    public static void main(String args[]) {


        //call greeting1 method from greetings class by using new keyword
        //No parameters and no return value
        Greetings gr = new Greetings();
        //to invoke or call greetings1 method
        //gr.greeting1();

        //No parameters and return value
        //in order to print out the return value of greetings2 method, you have to hold the return value in a variable or specific data type
        String str=gr.greetings2();
        System.out.println(str);
        //or directly call it using print statement
        System.out.println(gr.greetings2());

        //Take parameters but no return value
        gr.greeting3("Khali_Yoda");

        //4. Take parameters and returns a value
        String output=gr.greeting4("Khali_KhaliYoda");
        System.out.println(output);



    }
}