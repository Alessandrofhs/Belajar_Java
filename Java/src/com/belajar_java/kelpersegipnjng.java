package com.belajar_java;

import java.util.*;

public class kelpersegipnjng{
	public static void main(String[] args){
		int luas,kel,pnjng,lbr,pilihan;
		Scanner input = new Scanner (System.in);
		System.out.println ("masukan pilihan : ");
		System.out.println ("1. Perhitungan Luas Persegi panjang ");
		System.out.println ("2. Perhitungan kel Persegi panjang ");
		System.out.println ("...................................");
		pilihan = input.nextInt();
		if(pilihan == 1){
			System.out.println ("masukan nilai panjang : ");
			pnjng = input.nextInt();
			System.out.println ("masukan nilai lebar : ");
			lbr = input.nextInt();
			luas = pnjng*lbr;
			System.out.println ("luas persegi panjang adalah "+luas);
			}
			else if (pilihan == 2);
			System.out.println ("masukan nilai panjang : ");
			pnjng = input.nextInt();
			System.out.println ("masukan nilai lebar : ");
			lbr = input.nextInt();
			kel = 2*(pnjng+lbr);
			System.out.println ("kel persegi panjang adalah "+kel);
		}
	}

