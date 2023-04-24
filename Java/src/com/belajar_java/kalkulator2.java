package com.belajar_java;

import java.util.Scanner;

public class kalkulator2{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double a,b,hasil;
        char operator;

        System.out.println("masukkan nilai a:");
        a = input.nextDouble();
        System.out.println("masukkan operator");
        operator = input.next().charAt(0);
        System.out.println("masukkan nilai b:");
        b = input.nextDouble();
        System.out.println("input = " + a + operator + b );

        switch (operator) {
            case '+':
                hasil = a+b;
                System.out.println("hasil = "+hasil);
                break;
            case '-':
                hasil = a-b;
                System.out.println("hasil = "+hasil);
                break;
            case '*':
                hasil = a*b;
                System.out.println("hasil = "+hasil);
                break;
            case '/':
                hasil = a/b;
                System.out.println("hasil = "+hasil);
                break;
        
            default:
            System.out.println("operator " + operator +" tidak ditemukan");
        }

    }
}