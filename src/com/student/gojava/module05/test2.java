package com.student.gojava.module05;
public class test2 {
    public static void selectionSort(int[] arr) {
    /*По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний,  2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
                            /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
                               /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                                                                                   //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
                                            /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[30];
        for(int i = 0;i<arr.length; i++) {           //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
            System.out.print("\n");
            selectionSort(arr);
            for(int i = 0; i <  arr.length; i++) {
                System.out.print(arr[i] + "  ");
    }

        }
    }
