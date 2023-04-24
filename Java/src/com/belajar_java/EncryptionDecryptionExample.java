package com.belajar_java;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class EncryptionDecryptionExample {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan plaintext/ciphertext: ");
        String input = sc.nextLine();

        System.out.print("Pilih mode: (1) Enkripsi (2) Dekripsi : ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kunci: ");
        String key = sc.nextLine();

        if (choice == 1) {
            // Enkripsi plaintext dengan kunci DES
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(keyBytes, "DES");

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] plaintextBytes = input.getBytes("UTF-8");
            byte[] ciphertextBytes = cipher.doFinal(plaintextBytes);

            String ciphertext = Base64.getEncoder().encodeToString(ciphertextBytes);
            System.out.println("Ciphertext hasil enkripsi: " + ciphertext);

        } else if (choice == 2) {
            // Dekripsi ciphertext dengan kunci DES
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(keyBytes, "DES");

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] ciphertextBytes = Base64.getDecoder().decode(input);
            byte[] plaintextBytes = cipher.doFinal(ciphertextBytes);

            String plaintext = new String(plaintextBytes, "UTF-8");
            System.out.println("Plaintext hasil dekripsi: " + plaintext);

        } else {
            System.out.println("Pilihan tidak valid!");
        }

    }
}