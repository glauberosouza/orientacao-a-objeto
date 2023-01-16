package br.com.glauber.exerc9;

import java.util.Arrays;

public class SobreArrays {
    public static void main(String[] args) {


        int[] serialNumbers = new int[10];
        serialNumbers[0] = 123456;
        serialNumbers[1] = 234567;
        serialNumbers[2] = 345678;
        serialNumbers[3] = 456789;
        serialNumbers[4] = 5678910;
        serialNumbers[5] = 67891011;
        serialNumbers[6] = 789101112;
        serialNumbers[7] = 89101112;
        serialNumbers[8] = 12345432;
        serialNumbers[9] = 1234567654;


        System.out.println(Arrays.toString(serialNumbers));
        System.out.println();

        for (int i = 0; i < serialNumbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(serialNumbers[i]);
            }
        }
    }
}
