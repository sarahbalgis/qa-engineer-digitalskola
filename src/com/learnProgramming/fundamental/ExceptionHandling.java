package com.learnProgramming.fundamental;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input nilai pertama: ");
            int n1 = input.nextInt();

            System.out.print("Input nilai kedua: ");
            int n2 = input.nextInt();

            int sum = n1 / n2;
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("You can't do that");
        }
//        if (n2 != 0) {
//            // Menggunakan tipe data double untuk hasil desimal
//            double sum = (double) n1 / n2;
//            System.out.print("Hasil: " + sum);
//        } else {
//            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
//        }

    }
}
