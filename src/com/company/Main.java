package com.company;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int res = 0;

        while (i <= 50) {
            if (i % 3 == 0 && i% 5 == 0) {
                res++;
                System.out.print(i+ " ");
            }
            i++;
        }
        System.out.println();
        System.out.println(res);

    }
}


