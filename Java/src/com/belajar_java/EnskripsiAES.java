package com.belajar_java;

import java.util.Base64;    
import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;   
import javax.crypto.SecretKey;
import java.util.*;

public class EnskripsiAES {
    static Cipher cipher;  

    public static void main(String[] args) throws Exception {
        /* 
         create key 
         If we need to generate a new key use a KeyGenerator
         If we have existing plaintext key use a SecretKeyFactory
        */ 
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // block size is 128bits
        SecretKey secretKey = keyGenerator.generateKey();
        
        /*
          Cipher Info
          Algorithm : for the encryption of electronic data
          mode of operation : to avoid repeated blocks encrypt to the same values.
          padding: ensuring messages are the proper length necessary for certain ciphers 
          mode/padding are not used with stream cyphers.  
         */
        cipher = Cipher.getInstance("AES"); //SunJCE provider AES algorithm, mode(optional) and padding schema(optional)  

        String plainText;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan kata yang ingin di enskripsi : ");
        plainText = input.nextLine();

        String encryptedText = encrypt(plainText, secretKey);
        System.out.println("Enkripsi teks: " + encryptedText);

        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("Dekripsi teks: " + decryptedText);
    }

    public static String encrypt(String plainText, SecretKey secretKey)
            throws Exception {
        byte[] plainTextByte = plainText.getBytes();
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedByte = cipher.doFinal(plainTextByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedByte);
        return encryptedText;
    }

    public static String decrypt(String encryptedText, SecretKey secretKey)
            throws Exception {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encryptedText);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
        String decryptedText = new String(decryptedByte);
        return decryptedText;
            }
        }