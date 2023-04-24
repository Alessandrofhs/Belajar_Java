package com.belajar_java;

import java.util.*;

public class praktikum_6 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("##  Membuat Deret Angka  ##");
        System.out.println("========================================");
        System.out.println();

        String jumlah_deret;
        System.out.print("Jumlah deret yang diinginkan: ");
        jumlah_deret = MyObj.nextLine();
        String[] input = jumlah_deret.split("-", 2);
        // input to int
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        for (int i = start; i <= end; ++i) {
            System.out.print(i + " ");
        }
        // while (start <= end) {
        // System.out.print(start + " ");
        // start++;
        // }
        // do {
        // System.out.print(start + " ");
        // start++;
        // } while (start <= end);
        System.out.println();
    }
}