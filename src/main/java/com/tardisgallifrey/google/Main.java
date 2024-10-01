package com.tardisgallifrey.google;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //hash collision procedures for Advanced Java Class

        int key = 66;
        int H2 = 10;
        int i = 4;
        ArrayList<Integer> buckets = new ArrayList<>(H2);
        for(int j = 0; j < H2; j++) {
            buckets.add(-1);
        }

        buckets.set(0, 60);
        buckets.set(3, 223);
        buckets.set(4, 104);
        buckets.set(6, 66);
        buckets.set(9, 49);


        System.out.println(((hash1(key) + i * hash2(key)) % H2));


    }

    public static int hash1(int key){
        int H1 = 10;
        return key % H1;
    }

    public static int hash2(int key){
        int H2 = 7;
        return H2 - key % H2;
    }
}