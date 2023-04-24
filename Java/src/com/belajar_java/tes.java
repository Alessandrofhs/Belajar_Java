package com.belajar_java;

import java.util.*;

public class tes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan jenis_kelamin : ");
        String jenis_kelamin = scan.nextLine();
        System.out.println("masukan tinggi : ");
        int tinggi = scan.nextInt();

        if (tinggi >= 170 && jenis_kelamin == "L") {
            System.out.println("Anda dapat mengikuti program");
        } else if (tinggi >= 155 && jenis_kelamin == "P") {
            System.out.println("Anda dapat mengikuti program");
        } else {
            System.out.println("Anda tidak dapat mengikuti program");
        }
    }
}
