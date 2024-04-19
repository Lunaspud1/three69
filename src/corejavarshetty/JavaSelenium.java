package corejavarshetty;

public class JavaSelenium {
    public static void main(String args[]) {

        //check that array has multiple of 2
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 122};
        for (int i = 0; i < array3.length; i++)
        {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
            else
            {
                System.out.println(array3[i] + " These numbers are not multiple of 2 ");
            }

        }
    }
}


