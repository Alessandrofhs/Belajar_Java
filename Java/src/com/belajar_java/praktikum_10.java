package com.belajar_java;

import java.util.Scanner;
public class praktikum_10{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
        int kdmtkl, sks, nilai,p;
        int jmlmtkl =1;
        String nmmtkl;
        String h = null;
        double q, jmlsks = 0, nilaimutu = 0, jmlnilai=0, bebanmatkul=0, qr = 0, bb = 0;
        
        System.out.print("Berapa matkul? ");
        p = input.nextInt();
        
        while (jmlmtkl<=p){
            System.out.println("=============================");
            System.out.println("Mata kuliah ke-"+jmlmtkl);
        jmlmtkl++;
        
        System.out.print("Kode Mata Kuliah : ");
        kdmtkl = input.nextInt();
        System.out.print("Nama Mata Kuliah : ");
        nmmtkl = input.next();
        System.out.print("Jumlah Sks : ");
        sks = input.nextInt();
        System.out.print("Nilai : ");
        nilai = input.nextInt();
        
        if (nilai>=90){
        h="A";
        q=4.0;}
        else if (nilai>=80){
        h="A-";
        q=3.7;}
        else if(nilai>=75){
        h="B+";
        q=3.3;}
        else if(nilai>=70){
        h="B";
        q=3.0;}
        else if(nilai>=65){
        h="B-";
        q=2.7;}
        else if(nilai>=60){
        h="C+";
        q=2.3;}
        else if(nilai>=55){
        h="C";
        q=2.0;}
        else if(nilai>=50){
        h="C-";
        q=1.7;}
        else if(nilai>=40){
        h="D";
        q=1.0;}
        else{
        h="E";
        q=0;}
        
      bb = q*sks;
      bebanmatkul += bb;
      jmlsks +=sks;
      jmlnilai += nilai;
      nilaimutu = bebanmatkul/jmlsks;
            
    }
        System.out.println("=============================");
        System.out.println("Jumlah Nilai : "+ jmlnilai);
        System.out.println("Jumlah sks : " + jmlsks);
        System.out.println("Jumlah poin : " + bb);
        System.out.println("Nilai Mutu : " + nilaimutu);
    }
}