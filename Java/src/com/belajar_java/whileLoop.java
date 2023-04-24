package com.belajar_java;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        int a = 1;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("while loop ke " +a);
            a++;

            if (a==10) {
                kondisi = false;
            }
        }
        System.out.println("akhir program");
    }
}