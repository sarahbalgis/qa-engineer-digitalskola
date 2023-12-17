package com.taskProgramming.fundamental;

import java.util.Scanner;

public class TaskSegitigaLooping {

    public static void main(String[] args) {

        System.out.println("Homework 3 - Programming Fundamental");
        System.out.println("Tugas : Membuat Segitiga Menggunakan Loop Statement");
        System.out.println("Nama: Siti Sarah Balgis");
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        int barisTengah = (tinggi + 1) / 2;

        for (int i = 1; i <= tinggi; i++) {
            int maxX = (i <= barisTengah) ? i : tinggi - i + 1;

            for (int j = 1; j <= maxX; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        scanner.close();
    }
}