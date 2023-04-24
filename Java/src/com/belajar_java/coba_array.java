package com.belajar_java;

import java.util.*;

public class coba_array{
	public static void main(String[] args){
		int num[] = {50,20,45,82,25,63};
		int l = num.length;
		int i,j,t;
		//menampilkan nilai dalam arrray 50,20,45,82,25,63
		System.out.println("Given number : ");
		for (i = 0;i<l;i++ ){
			System.out.println(" " + num[i]);
		}

		System.out.println("\n");
		System.out.println("Accending order number : ");
		Arrays.sort(num);// proses pengurutan dibantu oleh package util
		for(i = 0;i<l;i++){
			//menampilkan hasil pengurutan
			System.out.println(" " + num[i]);
		}
	}
}