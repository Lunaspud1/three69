package qatechiepavanwebtesting.day12;

public class FinalVariable {

    //create a normal variable
    final int speed = 100;

    public static void main (String args []) {

        //access the variable by creating an object of the class
        FinalVariable fv = new FinalVariable();
        //fv.speed=200;
        System.out.println(fv.speed);  //outputs 200 (but this will be incorrect if i add final to the speed variable)

    }



}
