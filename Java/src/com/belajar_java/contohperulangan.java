package com.belajar_java;

import java.util.Scanner;

public class contohperulangan {
    public static void main(String[] args) {
        int nilaiawal,nilaiakhir,total;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nilai awal : ");
        nilaiawal = input.nextInt();
        System.out.println("masukkan nilai akhir : ");
        nilaiakhir = input.nextInt();

        // while (nilaiawal <= nilaiakhir) {
        //     total = total + nilaiawal;
        //     System.out.println("ditambah "+nilaiawal+" menjadi "+ total);
        //     nilaiawal++;
        // }

        // do {total = total + nilaiawal;
        //     nilaiawal++;
        //     System.out.println("ditambah "+nilaiawal+" menjadi "+total);
        // } while (nilaiawal <= nilaiakhir);

        for(total = 0; nilaiawal <= nilaiakhir ; nilaiawal++);
        total = total+nilaiawal;
        nilaiawal++;
        {
            System.out.println("ditambah "+nilaiawal+" menjadi "+ total);
        }
    }
}