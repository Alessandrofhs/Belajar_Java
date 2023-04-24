package com.belajar_java;

import java.util.Scanner;
public class lat_3 {
    public static void main(String[] args) {
    int batas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan batas= ");
    batas= scan.nextInt();

    int angka=1, cacah=1;
    while (angka<=batas) {
        System.out.print(angka+" ");
        angka=angka+cacah;
        cacah++;
    }
}
} 