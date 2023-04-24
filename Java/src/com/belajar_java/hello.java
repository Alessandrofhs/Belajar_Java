package com.belajar_java;

import java.util.*;
public class hello{
    public static void main (String args[]) {
        String kalimat;
        Scanner in = new Scanner(System.in);
        System.out.println("masukan sebuah kalimat : ");
        kalimat = in.nextLine();
        System.out.println("kalimat yang diinputkan adalah "+ kalimat);
    }
}