package com.belajar_java;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class EnkripDekripDES {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String key, input;
        int pilih;

        System.out.println("--------------------------------------");
        System.out.println("|----Alessandro, Az-Zahra, Marina----|");
        System.out.println("|--Program Enskripsi & Dekripsi DES--|");
        System.out.println("--------------------------------------");

        System.out.println("masukkan plaintext/ciphertext : ");
        input = scanner.nextLine();

        System.out.println("Masukkan Pilihan Anda ? (ketik angka saja)");
        System.out.println("1. enkripsi");
        System.out.println("2. dekripsi");
        pilih = scanner.nextInt();
        scanner.nextLine();

        System.out.println("masukkan key : ");
        key = scanner.nextLine();

        if (pilih == 1) {
            // Enkripsi plaintext dengan kunci DES
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(keyBytes, "DES");

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] plaintextBytes = input.getBytes("UTF-8");
            byte[] ciphertextBytes = cipher.doFinal(plaintextBytes);

            String ciphertext = Base64.getEncoder().encodeToString(ciphertextBytes);
            System.out.println("Ciphertext hasil enkripsi: " + ciphertext);
        }
        else if(pilih == 2){
            // Dekripsi ciphertext dengan kunci DES
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(keyBytes, "DES");

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] ciphertextBytes = Base64.getDecoder().decode(input);
            byte[] plaintextBytes = cipher.doFinal(ciphertextBytes);

            String plaintext = new String(plaintextBytes, "UTF-8");
            System.out.println("Plaintext hasil dekripsi: " + plaintext);
        } else{
            System.out.println("pilihan tidak valid!!");
        }
    }
}