package com.belajar_java;

import java.util.Scanner;

public class inputnilaimhs {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nama;
        int NIM;
        int nilaiTugas;
        int nilaiUTS;
        int nilaiUAS;
        int nilaiAkhir;
        String grade;

        System.out.println("masukkan nama mahasiswa : ");
        nama = input.nextLine();
        System.out.println("masukkan NIM mahasiswa : ");
        NIM = input.nextInt();
        System.out.println("masukkan nilai tugas : ");
        nilaiTugas = input.nextInt();
        System.out.println("masukkan nilai UTS : ");
        nilaiUTS = input.nextInt();
        System.out.println("masukkan nilai UAS : ");
        nilaiUAS = input.nextInt();
        nilaiAkhir = (nilaiTugas+nilaiUTS+nilaiUAS)/3;

        if(nilaiAkhir>=85 && nilaiAkhir<=100){
            grade = "A";
        }
        else if(nilaiAkhir>=75 && nilaiAkhir<=84){
            grade = "B";
        }
        else if(nilaiAkhir>=65 && nilaiAkhir<=74){
            grade = "C";
        }
        else if(nilaiAkhir>=55 && nilaiAkhir<=64){
            grade = "D";
        }
        else {
            grade = "E";
        }
        System.out.println("=====DATA NILAI MAHASISWA=====");
        System.out.println("Nama mahasiswa : "+nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Nilai Tugas : "+nilaiTugas);
        System.out.println("Nilai UTS : "+nilaiUTS);
        System.out.println("Nilai UAS : "+nilaiUAS);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Grade : "+grade);
    }
}