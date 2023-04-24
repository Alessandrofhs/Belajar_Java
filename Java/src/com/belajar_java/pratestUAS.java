package com.belajar_java;

import java.util.Scanner;

public class pratestUAS {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
        int jmldt =1,p=0,r=0,e=0, k=0,a=0,b=0;
        System.out.print("Berapa data? ");
        p = input.nextInt();
        
        while (jmldt<=p){
            
        jmldt++;
        System.out.println("==============================================");
		System.out.print("Tahun Prodi : ");
		int i=input.nextInt();
		System.out.print("Teknik Komputer : ");
		r=input.nextInt();
		System.out.print("Teknik Elektro: ");
		e=input.nextInt();
        k = (r+e)/2;
        System.out.print("Rata-rata Kelulusan tahun " + i +" semua prodi: ");
		System.out.println (" " +k);
        
        a+=r/2;
        b+=e/2;
        }
	
		System.out.print("==============================================");	
		System.out.print("\nRata-rata pertahun prodi Teknik Komputer : ");	
		System.out.println (" " +a);
		System.out.print("Rata-rata pertahun prodi Teknik Elektro : ");
		System.out.println (" " +b);
    }
}