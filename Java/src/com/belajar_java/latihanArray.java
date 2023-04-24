package com.belajar_java;

import java.util.Scanner;

public class latihanArray{
    public static void main(String[] args) {
        
        System.out.println("masukkan list nama : ");
        String[] nama = new String[5];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < nama.length; i++){
            System.out.println("nama ke "+i+" : ");
            nama[i] = input.nextLine();
        }
        System.out.println("-----------------------");
        for(String n : nama){
            System.out.println(n);
        }  
    }
}