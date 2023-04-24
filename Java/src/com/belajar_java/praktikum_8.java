package com.belajar_java;

import java.util.*;

public class praktikum_8 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("##  Membuat piramida  ##");
        System.out.println("========================================");
        System.out.println();

        String jumlah_deret;
        System.out.print("Jumlah deret yang diinginkan: ");
        jumlah_deret = MyObj.nextLine();
        String[] input = jumlah_deret.split("-", 2);
        // input to int
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // while (start<=end) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // do {
        // for (int j = 1; j <= 0; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }while(start<=end);
    }
}
