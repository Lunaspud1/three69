package qatechiepavanwebtesting.day15;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo2 {

    public static void main (String args []) throws IOException, InterruptedException {
        FileReader fr = new FileReader("/home/ademiju/Ade doc.txt");
        BufferedReader bfr = new BufferedReader(fr);

        System.out.println(bfr.readLine());
        Thread.sleep(5000);

    }
}
