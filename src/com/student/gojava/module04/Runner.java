package com.student.gojava.module04;


import java.util.InputMismatchException;


public class Runner {
    public static void main(String[] args)  {

        Distance distanc = new Distance();
        distanc.distance();
        System.out.println("\n"+ "And now we calculate the figures area"+"\n");
        AreaFigure areaFigure = new AreaFigure();
        areaFigure.getAreaFigure();
    }
}


