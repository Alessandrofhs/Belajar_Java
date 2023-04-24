package com.belajar_java;

import java.util.*;

public class lpersegipnjng{
	public static void main(String[] args){
		int luas,pnjng,lbr;
		Scanner input = new Scanner (System.in);
		System.out.println ("masukan nilai panjang : ");
		pnjng = input.nextInt();
		System.out.println ("masukan nilai lebar : ");
		lbr = input.nextInt();
		luas = pnjng*lbr;
		System.out.println("luas persegi panjang adalah "+luas);
	}
}