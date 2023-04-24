package com.belajar_java;

import java.util.Scanner;
public class nilaiMahasiswa{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nilaiTugas;
        int nilaiUTS;
        int nilaiUAS;
        int hasilNilai;

        System.out.println("masukkan nilai Tugas : ");
        nilaiTugas = input.nextInt();
       
        System.out.println("masukkan nilai UTS : ");
        nilaiUTS = input.nextInt();

        System.out.println("masukkan nilai UAS : ");
        nilaiUAS = input.nextInt();

        hasilNilai = (nilaiTugas+nilaiUTS+nilaiUAS)/3;
        System.out.println("jadi nilai mahasiswa adalah : "+hasilNilai);
    }
}