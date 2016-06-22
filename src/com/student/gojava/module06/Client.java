package com.student.gojava.module06;
import java.util.Random;
/**
 метод инициализации кошелька
 */
public class Client {
    String name;
    public int totalSumPurchases;

    public  void totalSumPurchases() {

            Random randomCashClient = new Random();
            int c = randomCashClient.nextInt(200);
            System.out.println("Client have money " + c + " y.e");
    }
}