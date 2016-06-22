package com.student.gojava.module04;
import java.util.Scanner;

//Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.

public class AreaFigure {

    private static final double PI = 3.14;

    public double getAreaTriangle(double sideA, double sideB) {
        return sideA * sideB / 2;
    }

    private double getAreaRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }

    private double getAreaCircle(double radius, double PI) {
        return radius * radius * PI;
    }

    void getAreaFigure() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A size ");
        try {
            double sideA = scanner.nextDouble();

            System.out.println("Please enter side B size ");

            double sideB = scanner.nextDouble();

            System.out.println("Please enter radius size");

            double radius = scanner.nextDouble();
            if (sideB <= 0 | sideA <= 0 | radius <= 0)

                    throw new NegativAreaExeption(sideA,sideB,radius);


            System.out.println("wtf");
            AreaFigure areaFigureTriangle = new AreaFigure();

            double areaTriangle = areaFigureTriangle.getAreaTriangle(sideA, sideB);

            System.out.println("Area Triangle is " + areaTriangle);

            AreaFigure areaFigureRectangle = new AreaFigure();

            double areaRectangle = areaFigureRectangle.getAreaRectangle(sideA, sideB);
            System.out.println("Area Rectangle is " + areaRectangle);

            AreaFigure areaFigureCircle = new AreaFigure();
            double areaCircle = areaFigureCircle.getAreaCircle(radius, PI);
            System.out.println("Area Circle is " + areaCircle);


        } catch (NegativAreaExeption e) {
            System.out.println("+");
        }

    }
}