package qatechiepavanwebtesting.day9methods;

public class Calculator {
//calculator
    int x=10, y=20;
    //1, No Params and No return value
  /*  void add() //empty brackets represent no paramenters
    {
       System.out.println(x+y); //no return value just printing the sum of 2 numbers
    }
   */

    //2, No parameters but will Return a value
    //No inputs in brackets i.e. no paramenter
    /*int add()//we have to declare the return type instead of void
    {
        return(x+y); //returning a statement/value
    }

     */
    //3, Take Param no Return value
    //no return value =void
   /* void add(int a, int b) //taking two arguments of integer data type
    {
        System.out.println(a+b);
    }
    */
    //4, TAke Param and Returns an value
    int add (int a, int b)// takes parameters inside brackets
    {return (a+b);//returning a value/statement
    }



}

