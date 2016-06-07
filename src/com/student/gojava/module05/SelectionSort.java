package com.student.gojava.module05;
//public static void selectionSort(int[] arr)
// Выбрать один из алгоритмов сортировки массивов и реализовать его
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 45, 15, 15, 4, 82, 45, 78, 25, 55, 56, 56, 85, 2, 14, 76, 59, 78, 46, 31, 25, 14};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min1 = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min1 = j;
                }
            }
            if (i != min1) {
                int tmp = arr[i];
                arr[i] = arr[min1];
                arr[min1] = tmp;
            }
        }

    }

}