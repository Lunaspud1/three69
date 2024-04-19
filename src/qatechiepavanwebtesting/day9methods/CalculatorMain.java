package qatechiepavanwebtesting.day9methods;

public class CalculatorMain {
    public static void main(String args[]) {
        //call or access calculator method by creating an object of Calculator
        Calculator cal = new Calculator();
        //cal.add();//no param no return value method

      /*  //declare the return type
        int result = cal.add();//we have to capture the output in a variable i.e. result
        System.out.println(result);//no param but returns an output
    }
      */
        //cal.add(100, 300);//param but no return value
        //}
        int res = cal.add(189, 753);//takes param and returns an output
        System.out.println(res);
        //or directly from print statement with one single statement
        System.out.println(cal.add(189, 753));
    }
}
