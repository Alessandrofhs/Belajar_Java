package com.belajar_java;

import java.util.*;
public class tugas_no_1 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        
        System.out.println("Hallo siapa namamu?");
        String nama = MyObj.nextLine();
        
        System.out.println("Hallo "+ nama + " berapa usiamu?");

        String umur = MyObj.nextLine();
        int umurInt = Integer.parseInt(umur);
        System.out.println("usiamu " + umurInt + " tahun, Dimanakah alamatmu?");
        
        String alamat = MyObj.nextLine();
        System.out.println("alamatmu " + alamat + ", dimanakah tempat kuliahmu?");
        
        String universitas = MyObj.nextLine();
        System.out.println("kampusku " + universitas + ", apa program studimu?");

        String jurusan = MyObj.nextLine();
        System.out.println("program studimu " + jurusan);
    }
}
    
