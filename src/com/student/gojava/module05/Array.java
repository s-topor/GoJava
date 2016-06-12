package com.student.gojava.module05;
//Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[])

public class Array implements InterfaceArray {

    int[] arr = {10, 45, 15, 15, 4, 82, 45, 78, 25, 55, 56, 57, 85, 2, 14, 76, 59, 78, 46, 31, 25, 14};

    public void arraySearchMaxMin() {

        //создали   и  объявили массив
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum number of array = " + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum number of array = " + min);
    }
// Выбрать один из алгоритмов сортировки массивов и реализовать его

    public void selectionSort() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
            int min = arr[i];
            int min1 = i;

            /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min1 = arr[j];
                }
            }
            /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
            if (i != min1) {
                int tmp = arr[i];
                arr[i] = arr[min1];
                arr[min1] = tmp;
            }
        }
    }
    @Override
    public String toString(){
        String arrayToStr = "";
        for (int i = 0; i < arr.length; i++) {
            arrayToStr += "[" + arr[i] + "]";
        }
        return arrayToStr;
    }
}
