package com.belajar_java;

import java.util.Scanner;

public class no_10 {
    public static void main (String [] hady){
        Scanner input = new Scanner (System.in);
        String kode_mtkl , nama_mtkl, nama, nim ;
        int sks , nilai ;
        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.println("masukkan nama : ");
        nama = input.nextLine();
        System.out.println("masukkan nim : ");
        nim = input.nextLine();
        System.out.print("Masukan kode matkul : ");
        kode_mtkl = input.nextLine();
        System.out.print("Masukan Nama matkul : ");
        nama_mtkl = input.nextLine();
        System.out.print("Nilai sks : ");
        sks = input.nextInt();
        System.out.print("Nilai  : ");
        nilai = input.nextInt();
        n_akhir = ( sks * nilai );
        char grade;
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }
}