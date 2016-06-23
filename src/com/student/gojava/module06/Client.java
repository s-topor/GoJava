package com.student.gojava.module06;
import java.util.Random;
import java.util.Scanner;

/**
 этот метод totalSumPurchases  запрашивает ввод имени клиента и рандомом определяет содержимое его кошелька
 */
public class Client {
    public String firstName ;
    public int totalSumPurchases;

    public  void totalSumPurchases() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client name ");
        String firstName = scanner.nextLine();
        Random randomCashClient = new Random();
        int cash = randomCashClient.nextInt(200);
        System.out.println( firstName + " have money " + cash + " y.e " );
    }
}