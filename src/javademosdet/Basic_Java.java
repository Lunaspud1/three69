package javademosdet;

public class Basic_Java {
    public static void main (String [] args) {
       /* int a =100;
        System.out.println(a++-++a);
        System.out.println(a);

        //2 to the power of 3 = 8
        System.out.println(Math.pow(2,3));
*/
        double x = 83.0;
        double y = 62.0;
        double z = 2.0;

        double sum1 = Math.pow(x,2) + Math.pow(y,2);
        double sum2 = Math.abs(z);
        double sum3 = sum1-sum2;

        double finalsum = Math.cbrt(sum3);
        System.out.println(finalsum);


    }
}
