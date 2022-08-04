package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("BankUZB");
        for (; ; ) {
            System.out.println("Next -> 1");
            System.out.println("Quit ->");
            System.out.println(" = ");
            int n = scanner.nextInt();

            if (n == 1) {
                System.out.println("Name wtite");
               scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                System.out.println("Cart number write");

                int cart = scanner.nextInt();
                System.out.println("Write money");
                int money = scanner.nextInt();

                System.out.println("Year write :");
                int year = scanner.nextInt();
                double p = 23;
               double res = 0;
                double f = money * p / 100;

                for (int i = 1; i <= year; i++) {

                  f = i;
                 res = f + money;
                }
                System.out.println("Mr " + name + " " + res + " $");

            } else if (n == 0) {
                break;
            } else {
                System.out.println("Write inorrect number !!!");
            }


        }
    }
}







