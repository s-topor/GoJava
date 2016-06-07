package com.student.gojava.module05;
//Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[])

public class ArraySearch {
    public static void main(String[] args) {
        int [] ar1 = {10,23,25,2,515,15,5,4,5,4,78,45,125,45,456,8564,54,5,44,58}; //создали  массив и  объявили
        int max = ar1[0];
        for(int i = 0; i < ar1.length; i++){
            if (ar1[i] > max) {
                max = ar1[i];
            }
        }
        System.out.println("The maximum number of array = " + max);

        int min = ar1[0];
        for (int i=0; i < ar1.length; i++){
            if (ar1[i] < min){
                min = i;
            }
        }
        System.out.println("The minimum number of array = "+ min);
    }
}
