package com.belajar_java;

import java.util.*;

public class cnthFibonacci {
    public static void main(String[] args) throws Exception {
        int bilinput, totprev, bil1, bil2, bil_ulang;

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah nilai fibonacci : ");
        bilinput = input.nextInt();

        bil1 = 0;
        bil_ulang = 0;
        bil2 = 1;
        totprev = 0;

        // while (bil_ulang<=bilinput) {
        //     totprev = bil1+bil2;
        //     bil2 = bil1;
        //     bil1 = totprev;

        //     System.out.println(" "+totprev);
        //     bil_ulang++;
        
        do{
            totprev = bil1+bil2;
            bil2 = bil1;
            bil1 = totprev;
            System.out.println(" "+totprev);
            bil_ulang++;
        }
        while(bil_ulang<=bilinput);
    }
}