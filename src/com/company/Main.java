package com.company;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int i = 1;
        int res = 0;

        while (i <= 100) {
            if (i % a == 0) {
                res++;
                System.out.print(i+ " ");
            }
            i++;
        }
        System.out.println();
        System.out.println(res);

    }
}


