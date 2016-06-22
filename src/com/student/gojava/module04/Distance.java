package com.student.gojava.module04;
//Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве
// (x1, y1), (x2, y2).
//   Чтобы извлечь квадратный корень из числа, применяют метод sqrt.
//   double х = 4;
//   double у = Math.sqrt(х);
//   System.out.println(у); // Печатает число 2.0.
//Math.pow возводит в степень
// double n = Math.pow(a,x);  a- число  x - степень

// d = root (x2-x1)*2 + (y2-y1)*2
//  A =(x2-x1)*2
//  B = (y2-y1)*2
//  D = root A + B

import java.util.Scanner;

public class Distance {

    public void distance(){
        System.out.println("We calculate the distance between two points! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a coordinate point 'x1' ");
        double x1 = scanner.nextDouble();
        System.out.println("Please, enter a coordinate point 'x2' ");
        double x2 = scanner.nextDouble();
        System.out.println("Please, enter a coordinate point 'y1' ");
        double y1 = scanner.nextDouble();
        System.out.println("Please, enter a coordinate point 'y2' ");
        double y2 = scanner.nextDouble();
        double A = x2 - x1;
        double B = y2 - y1;
        double A1 = Math.pow(A, 2);  //возводим в степень
        double B1 = Math.pow(B, 2);   //возводим в степень
        double D = A1 + B1;
        double D1 = Math.sqrt(D);    //извлекаем корень

        System.out.println("The distance between  the two points  " + D1);
    }
}