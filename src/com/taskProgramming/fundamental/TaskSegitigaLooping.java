package com.taskProgramming.fundamental;

import java.util.Scanner;

public class TaskSegitigaLooping {

    public static void main(String[] args) {

        System.out.println("Homework 3 - Programming Fundamental");
        System.out.println("Tugas : Membuat Segitiga Menggunakan Loop Statement");
        System.out.println("Nama: Siti Sarah Balgis");
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);

        int tinggi;
        do {
            System.out.print("Masukkan tinggi segitiga (Minimal 3): ");
            tinggi = scanner.nextInt();

            if (tinggi < 3) {
                System.out.println("Error: Tinggi segitiga harus minimal 3. Silakan masukkan kembali.");
                System.out.print("\n");
            }
        } while (tinggi < 3);

        int barisTengah = (tinggi + 1) / 2;

        for (int i = 1; i <= tinggi; i++) {
            int maxX = (i <= barisTengah) ? i : tinggi - i + 1;

            for (int j = 1; j <= maxX; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        // Tutup scanner setelah digunakan
        scanner.close();
    }
}