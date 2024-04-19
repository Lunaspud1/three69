package corejavarshetty;

public class Arrays {
    public static void main (String [] args){
        //Arrays (int array)
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[2]);
        //or
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("This is output for arr2:" +arr2[2]); //prints out value 2

        //for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //enhanced for loop
        for (int num : arr) {
            System.out.println("The value of my enhanced loop arr is:" + num);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        //enhanced for loop
        for (int num2 : arr2) {
            System.out.println("The value of my enhanced for loop for num2 is:" + num2);

            //String array
            String[] s_media = new String[]{"Twitter", "Instagram", "Youtube"};
            for (int i = 0; i < s_media.length; i++) {
                System.out.println(s_media[i]);
            }

            //Enhanced for loop (to output same values as above)
            for (String m : s_media) {
                System.out.println(m);
            }


        }
    }
}
