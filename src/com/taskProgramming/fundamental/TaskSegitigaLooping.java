package com.taskProgramming.fundamental;

public class TaskSegitigaLooping {

    public static void main(String[] args) {

        System.out.println("Homework 3 - Programming Fundamental");
        System.out.println("Tugas : Membuat Segitiga Menggunakan Loop Statement");
        System.out.println("Nama: Siti Sarah Balgis");
        System.out.print("\n");

        int baris = 10;
        int barisTengah = (baris + 1) / 2;

        for (int i = 1; i <= baris; i++) {
            int maxX = (i <= barisTengah) ? i : baris - i + 1;

            for (int j = 1; j <= maxX; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}