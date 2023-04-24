package com.belajar_java;

import java.util.*;

public class praktikum_7 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("##  Membuat Deret genap  ##");
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
        if (i % 2 == 0) {
        System.out.println(i);
        }
        }
     // while (start <= end) {
     //    if (i % 2 == 0) {
     //    System.out.println (i);
     //    }
        
     // do {
     //        if (  2 == 0) {
     //            System.out.println(i);           }
     // } while (start <= end);
    }
}