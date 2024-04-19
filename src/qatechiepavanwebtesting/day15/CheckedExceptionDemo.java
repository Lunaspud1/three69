package qatechiepavanwebtesting.day15;

public class CheckedExceptionDemo {


    public static void main (String args []) throws InterruptedException {
        System.out.println("Program is started...");
        System.out.println("Program is in progress");
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }

            System.out.println("Program is complete...");
            System.out.println("Program is exited...");

        }
    }
}
