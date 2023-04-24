package com.belajar_java;

import java.util.*;

public class ganjil_genap{
	public static void main(String[] args){
	int a;
	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();
	if (a % 2 == 0) {
		System.out.println("Tanggal hari ini genap "+a);
	}
	else {
		System.out.println("Tanggal hari ini ganjil "+a);
	}
}
}