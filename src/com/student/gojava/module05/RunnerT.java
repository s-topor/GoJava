package com.student.gojava.module05;

/**
 * Created by Серёга on 11.06.2016.
 */
public class RunnerT {
    public static void main(String[] args) {
        Array array = new Array();
        array.arraySearchMaxMin();
        array.selectionSort();
        System.out.println(" Array after sort");
        System.out.println(array.toString());

    }
}
