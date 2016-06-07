package com.student.gojava.module05;

// Выбрать один из алгоритмов сортировки массивов и реализовать его
public class SelectionSort {
    public static void main(String[] args) {


        int[] arraySort = {10, 45, 15, 15, 4, 82, 45, 78, 25, 55, 56, 56, 85, 2, 14, 76, 59, 78, 46, 31, 25, 14};

          for(int i = 0; i < arraySort.length; i++){
              int min = arraySort[i];
              int imin = i;

            for (int j = i + 1; j < arraySort.length; j++){
            if (arraySort[j] < min]{
            imin = j;
        }
    }
              if (i!= imin){
                  int tmp = arraySort[i];
                  arraySort[i] = arraySort[imin];
                  arraySort[imin]=tmp;
              }

          }
}

