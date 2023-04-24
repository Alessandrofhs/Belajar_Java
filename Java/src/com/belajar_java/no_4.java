package com.belajar_java;

public class no_4 {
    public static void main(String[] args) {
        int nilai = 5680;

        int jam = nilai / 3600;
        int sisa = nilai % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Jumlah jam : " + jam);
        System.out.println("Jumlah menit : " + menit);
        System.out.println("Jumlah detik : " + detik);
    }
}