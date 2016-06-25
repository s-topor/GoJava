package com.student.gojava.module06;

import java.util.Random;

/**
 */
public class RandomCash {

        public static void randI() {
        Random random = new Random();
            int r = random.nextInt(1000);
            System.out.println(r);
    }
     public static void randD(){

         Random random = new Random();
         double r = 1.0 + random.nextDouble() * 200.0;
         System.out.println(r);
     }

//    public static void main(String[] args) {
//        RandomCash randomCash = new RandomCash();
//        randomCash.randI();
    }
