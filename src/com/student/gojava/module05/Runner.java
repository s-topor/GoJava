package com.student.gojava.module05;


public class Runner {
    public static void main(String[] args) {

        Array array = new Array();
        array.arraySearchMaxMin();
        System.out.println("\n"+ "Array before sort" + "\n"+array.toString());
        array.selectionSort();
        System.out.print("\n"+ "Array after sort" + "\n"+ array.toString());


    }
}
