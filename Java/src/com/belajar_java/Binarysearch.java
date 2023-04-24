package com.belajar_java;

import java.util.Scanner;

public class Binarysearch {
	public static void main(String[] args) {
		int arrInt[] = {3,4,5,6,8,10,11,12,14};
		int flags=0;
		int cari=1;
		int posisiAwal=0,posisiAkhir=9,batasLoop=posisiAkhir-1,nilaiTengah;
		while(posisiAwal<=posisiAkhir && flags==0){
			nilaiTengah = (posisiAwal+posisiAkhir)/2;
			if(arrInt[nilaiTengah]==cari){
				flags=1;
			}else if (cari < arrInt[nilaiTengah]) {
				batasLoop = nilaiTengah-1;
			}else{
				posisiAwal = nilaiTengah-1;
			}
		}
		if (flags==1) {
			System.out.println("Data Ketemu :");
		}else{
			System.out.println("Data Tidak Ketemu :");
		}
	}
}