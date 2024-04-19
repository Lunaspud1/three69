package qatechiepavanwebtesting.day9methods;

public class Greetings {
    //1. No parameters and no return value

    void greeting1()
    {
        System.out.println("Hello....");
    }

    //2. No parameters and return value
    String greetings2()
    {
        return("Hello how are you?");
    }

    //3. Take parameters but no return value

    void greeting3(String name)
    {
        System.out.println("Hello   "+name);
    }

    //4. Take parameters and returns a value

    String greeting4(String name)
    {
        return ("Hello   "+name);
    }

}
