package com.tardisgallifrey.google;

public class Main {
    public static void main(String[] args) {

        //hash collision procedures for Advanced Java Class

        int key = 63;
        int H2 = 11;
        int i = 2;


        System.out.println(((hash1(key) + i * hash2(key)) % H2));


    }

    public static int hash1(int key){
        int H1 = 11;
        return key % H1;
    }

    public static int hash2(int key){
        int H2 = 5;
        return H2 - key % H2;
    }
}