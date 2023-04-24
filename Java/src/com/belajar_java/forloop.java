package com.belajar_java;

public class forloop {
    public static void main(String[] args) {

        System.out.println("ini adalah loop pertama");
        for(int nilai = 0; nilai <= 10; nilai++){
            System.out.println("for loop ke "+nilai);
        }
        
        System.out.println("ini adalah loop kedua");
        for(int nilai = 5; nilai <  10; nilai++){
            System.out.println("for loop ke "+nilai);
        }

        System.out.println("ini adalah loop ketiga");
        for(int nilai = 10; nilai >=  0; nilai--){
            System.out.println("for loop ke "+nilai);
        }

        System.out.println("ini adalah loop keempat");
        for(int nilai = 10; nilai >  0; nilai--){
            System.out.println("for loop ke "+nilai);
        }
        
        System.out.println("ini adalah loop kelima");
        int nilai = 5;
        for(; nilai >  0; nilai--){
            System.out.println("for loop ke "+nilai);
        }
            System.out.println("akhir program");
    }
}