package com.belajar_java;

import java.util.Scanner;

public class lat_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Konversi Nilai : ");
        String huruf = input.next();
        
        if (null == huruf){
            System.out.println("err");
        }
        else switch (huruf) {
            case "A":
                System.out.println(4);
                break;
            case "B":
                System.out.println(3);
                break;
            case "C":
                System.out.println(2);
                break;
            case "D":
                System.out.println(1);
                break;
            case "E":
                System.out.println(0);
                break;
            default:
                System.out.println("err");
                break;
        }
    }
}