package com.belajar_java;

import java.util.Arrays;
public class array01 {
    public static void main(String[] args) {
        int i,ganjil;
        float sum = 0;
        float rata;
        int num[]={23,6,47,35,2,14};
        int a=num.length;
        System.out.println("=> Nomor sebelum diurutkan : ");
        for(i=0;i<a;i++){
            System.out.println(" " + num[i]);
        }
        System.out.println("\n=> Nomor sesudah diurutkan : ");
        Arrays.sort(num);
        for (i=0;i<a;i++) {

        }
        System.out.println("\n=====================================\n");
        for (i=0;i<a;i++) {
            sum = sum + num[i];
        }
    rata = sum / a;
    System.out.println("=> Rata = "+rata);
    System.out.println("\n=========================================\n");
    System.out.println("=> Nilai minimal : ");
    Arrays.sort(num);
    System.out.println(" "+num[0]);
    System.out.println("\n=> Nilai maksimal : ");
    System.out.println(" "+num[a-1]);

    System.out.println("\n=========================================\n");
    System.out.println("=> Bilangan ganjil : ");
    for(i=0;i<a;i++) {
        if (num[i]%2!=0) {
            System.out.println(" "+num[i] );
        }
    }
    System.out.println("\n=========================================\n");
    System.out.println("=> Bilangan Prima : ");

    for(i=0;i<num.length;i++) {
        int ya=0;
        for (int bagi=1;bagi<num[i];bagi++){
            if (num[i]%bagi==0) {
                ya++;
            }
        }
    if(ya==1) {
        System.out.println(" "+num[i]);
        }
    }
    System.out.println("");
    }
}