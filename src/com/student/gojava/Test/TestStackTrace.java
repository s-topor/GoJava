package com.student.gojava.Test;
public class TestStackTrace{
    TestStackTrace()
    {
        try {
            devideByZero();
        }catch (ArithmeticException e){
            System.out.println("Dear /do not divide by zero");
        }

    }

    int devideByZero()
    {
        return 25/0;
    }
    public static void main(String[] args) {
        new TestStackTrace();

    }
}



