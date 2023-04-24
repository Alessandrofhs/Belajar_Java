package com.belajar_java;

public class Arraysample {

    static void main(String[] args) {
        int ages[] = new int[100];
        for (int i = 0; i < ages.length; i++) { // untuk mengisi array
            ages[i] = i + 1;
        }
        for (int i = 0; i < ages.length; i++) { // untuk menampilkan array
            System.out.println(ages[i]);
        }
    }

}
