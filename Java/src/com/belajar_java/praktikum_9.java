package com.belajar_java;

import java.util.*;

public class praktikum_9 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        String[] makanan = new String[5];
        String[] minuman = new String[5];

        int[] hargaMakanan = new int[5];
        int[] hargaMinuman = new int[5];

        makanan[0] = "Nasi Telur";
        makanan[1] = "Nasi Goreng";
        makanan[2] = "Magelangan";
        makanan[3] = "Mie Rebus";
        makanan[4] = "Mie Goreng";

        minuman[0] = "Es Teh / Teh hangat";
        minuman[1] = "Kopi";
        minuman[2] = "Good Day";
        minuman[3] = "Es Jeruk";
        minuman[4] = "Soda Gembira";

        hargaMakanan[0] = 6000;
        hargaMakanan[1] = 8000;
        hargaMakanan[2] = 7500;
        hargaMakanan[3] = 6000;
        hargaMakanan[4] = 6000;

        hargaMinuman[0] = 2000;
        hargaMinuman[1] = 2500;
        hargaMinuman[2] = 2500;
        hargaMinuman[3] = 2000;
        hargaMinuman[4] = 6000;

        System.out.println("===========================================================");
        System.out.println("|                       ALE RESTO                         |");
        System.out.println("===========================================================");
        System.out.println("Makanan");
        for (int i = 0; i < makanan.length; i++) {
            System.out.println((i + 1) + ". " + makanan[i] + " Rp." + hargaMakanan[i]);
        }
        System.out.println("===========================================================");
        System.out.println("Minuman");
        for (int i = 0; i < minuman.length; i++) {
            System.out.println((i + 1) + ". " + minuman[i] + " Rp." + hargaMinuman[i]);
        }
        System.out.println("===========================================================");

        System.out.print("Masukkan nomor makanan yang ingin dipesan : ");
        int nomorMakanan = Obj.nextInt();

        System.out.print("Masukkan nomor minuman yang ingin dipesan : ");
        int nomorMinuman = Obj.nextInt();

        int totalHarga = hargaMakanan[nomorMakanan - 1] + hargaMinuman[nomorMinuman - 1];
        System.out.println("===========================================================");
        System.out.println("Makanan\t\t: " + makanan[nomorMakanan - 1] + " - Rp." + hargaMakanan[nomorMakanan - 1]);
        System.out.println("Minuman\t\t: " + minuman[nomorMinuman - 1] + " - Rp." + hargaMinuman[nomorMinuman - 1]);
        System.out.println("Total harga\t: Rp." + totalHarga);
        System.out.println("===========================================================");

    }

}
