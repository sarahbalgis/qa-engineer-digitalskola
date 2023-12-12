package com.learnProgramming.advance;

public class LoopingArray {
    public static void main(String[] args) {

        int[] angka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("Looping Standard");
        for(int i=0; i<10; i++) {
            System.out.println("Index ke "+i+" adalah =" +angka[i]);
        }

        System.out.println("\n");
        System.out.println("Looping dengan properti length");
        for(int i=0; i<angka.length; i++) {
            System.out.println("index ke "+i+" adalah =" +angka[i]);
        }

        System.out.println("\n");
        System.out.println("Looping dengan collection");
        for(int array: angka) {
            System.out.println("index ke "+array+" adalah =" +array);
        }


    }
}
