package com.student.gojava.module04;


public class NegativNumExeption extends Exception{
    private double valueSideA;
    private double valueSideB;
    private double valueRadius;

    public NegativNumExeption(double sideA, double sideB, double valueSideA) {
        this.valueSideA = valueSideA;
        this.valueSideB = valueSideB;
        this.valueRadius = valueRadius;
    }

    public double getValueSideA() {
        return valueSideA;
    }

    public double getValueSideB() {
        return valueSideB;
    }

    public double getValueRadius() {
        return valueRadius;
    }
}
