package com.student.gojava.module05;

/**
 * Created by Серёга on 08.06.2016.
 */
public class test {
    public static void main(String[] args) {
        int[] ar = {78, 98, 76, 54, 35, 7, 8,};
        System.out.println(test.searchMin(ar));
    }

    private static int searchMin(int[]ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {
                 min = ar[i] ;
            }
        }
        return min;
    }
    }



