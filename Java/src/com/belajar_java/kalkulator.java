package com.belajar_java;

import java.util.Scanner; //import lib I/O java 

public class kalkulator{
  int hasil=0; 
  // Fungsi Penjumlahan a + b
        void Penjumlahan (int a,int b){
            hasil=a+b;
            System.out.println("Pertambahan : "+a+" + "+b+" = "+hasil);
        }
        //Fungsi Pengurangan a + b
        void Pengurangan (int a,int b){
            hasil=a-b;
            System.out.println("Pengurangan : "+a+" - "+b+"  = "+hasil);
        }
        //Fungsi Perkalian a + b
        void Perkalian (int a,int b){
            hasil=a*b;
            System.out.println("Perkalian   : "+a+" X "+b+" = "+hasil);
        }
        //Fungsi Pembagian a + b
        void Pembagian (int a,int b){
            hasil=a/b;
            System.out.println("Pembagian   : "+a+" / "+b+"  = "+hasil);
        }
 public static void main (String args[]){
  kalkulator mat = new kalkulator();
  Scanner input = new Scanner( System.in );  
  System.out.println("Kalkulator Sederhana V.1");
  System.out.println("karya IGBN. Satya Wibawa(1404505071)");
  
  System.out.println("pilihan  :");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.println("4. Pembagian");
  System.out.println("Masukan Pilihan anda  :");
  int pilihan = input.nextInt(); 
  
  System.out.println("Masukan bilangan a  :");
  int x = input.nextInt(); 
  System.out.println("Masukan bilangan b  :");
  int y = input.nextInt(); 
  
  switch(pilihan){
   case 1 :
     mat.Penjumlahan(x,y);
     break;
   case 2 :
     mat.Pengurangan(x,y);
     break;
   case 3 :
     mat.Perkalian(x,y);
     break;
   case 4 :
     mat.Pembagian(x,y);
     break;
   default :
     System.out.println("Maaf, pilihan salah");
     break;
  }
 }

}
