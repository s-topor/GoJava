package com.student.gojava.module04;

//Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.

//  Градусы по Фаренгейту = (градусы по Цельсию x 1.8) + 32
//  Градусы по Цельсию = (градусы по Фаренгейту - 32) / 1.8

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    public double converteCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    public double convertFahrenheitToCelsius(double fahrenheit){
        return  (fahrenheit - 32)  / 1.8;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter temperature in celsius ");

        try {
            double celsius = scanner.nextDouble();

        Converter converter = new Converter();

        double temperatureInFahrenheit = converter.converteCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit : " + temperatureInFahrenheit);

        double returnTemperatureInCelsius = converter.convertFahrenheitToCelsius(temperatureInFahrenheit);
        System.out.println("Temperature in Celsius was: "+ returnTemperatureInCelsius);

        }catch (InputMismatchException e){
            System.out.println("несоответствие типа вводимого значение");
        }

    }
}

