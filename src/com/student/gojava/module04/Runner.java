package com.student.gojava.module04;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Distance distanc = new Distance();
        try {
            distanc.distance();
        } catch (InputMismatchException e) {
            System.out.println("Несоответствие типа вводимого значения" );
        }

        AreaFigure areaFigure = new AreaFigure();
        System.out.println("And now we calculate the figures area" );
        areaFigure.getAreaFigure();
    }
}


