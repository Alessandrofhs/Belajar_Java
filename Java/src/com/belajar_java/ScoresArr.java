package com.belajar_java;

public class ScoresArr{
	public static void main(String[] args){
		int[] scores = new int[3]; // panjang array = 3
		scores[0] = 75;// index ke 0 bernilai 75
		scores[1] = 80;// index ke 1 bernilai 80
		scores[2] = 100;// index ke 2 bernilai 100

		for(int i=0;i<scores.length;i++){
		//untuk menampilkan output dari index array
			System.out.println("scores ke "+i+" = "+scores[i]);
		} 	
	}
}