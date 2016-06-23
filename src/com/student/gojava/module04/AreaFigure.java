//Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
//Домашнее задание к Модулю 6
//Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
// При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
package com.student.gojava.module04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaFigure {

    private static final double PI = 3.14;

    private   double getAreaTriangle(double sideA,double sideB) {
        return sideA * sideB / 2;
    }
    private double getAreaRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }
    private double getAreaCircle(double radius , double PI){
        return radius * radius * PI;
    }
    void getAreaFigure() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A size ");
        try {
            final double sideA = scanner.nextDouble();

            System.out.println("Please enter side B size ");
            final double sideB = scanner.nextDouble();

            System.out.println("Please enter radius size");
            final double radius = scanner.nextDouble();

            if (sideA <= 0| sideB<=0 | radius<=0) {
                throw new NegativNumExeption(sideA,sideB,radius);
            }

            AreaFigure areaFigureTriangle = new AreaFigure();
            double areaTriangle = areaFigureTriangle.getAreaTriangle(sideA, sideB);
            System.out.println("Area Triangle is " + areaTriangle);

            AreaFigure areaFigureRectangle = new AreaFigure();
            double areaRectangle = areaFigureRectangle.getAreaRectangle(sideA, sideB);
            System.out.println("Area Rectangle is " + areaRectangle);

            AreaFigure areaFigureCircle = new AreaFigure();
            double areaCircle = areaFigureCircle.getAreaCircle(radius, PI);
            System.out.println("Area Circle is " + areaCircle);
        }catch (InputMismatchException e) {
            System.out.println("Error: enter the number " );
        } catch (NegativNumExeption e) {
            System.out.println("[Error]: Enter sideA , sideB and radius greater than zero . ");
        }
    }
}
