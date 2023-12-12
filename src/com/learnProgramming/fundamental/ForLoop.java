package com.learnProgramming.fundamental;

public class ForLoop {
    public static void main(String[] args) {

        //for (inisialisasi; kondisi; step nilai)

        System.out.println("Ini adalah awal program");

        System.out.println("Loop Pertama");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("Loop Kedua");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("Loop Ketiga");
        for (int nilai = 10; nilai > 5; nilai--) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("Loop Keempat");
        int nilai = 0;
        for (; nilai < 10;) {
            System.out.println("For Loop ke-" + nilai);
            nilai++;
        }
    }
}
