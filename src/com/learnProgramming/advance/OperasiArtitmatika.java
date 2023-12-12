package com.learnProgramming.advance;

import java.util.Scanner;

public class OperasiArtitmatika {

    public static void main(String[] args){
        int nilaiA;
        int nilaiB;
        int hasil;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("input nilai A :");
        nilaiA = inputUser.nextInt();
        System.out.println("input nilai B :");
        nilaiB = inputUser.nextInt();

        // penjumlaha2n
        hasil = nilaiA + nilaiB;
        System.out.printf("%d + %d = %d \n",nilaiA,nilaiB,hasil);

        // pengurangan
        hasil = nilaiA - nilaiB;
        System.out.printf("%d - %d = %d \n",nilaiA,nilaiB,hasil);

        // pembagian
        hasil = nilaiA / nilaiB;
        System.out.printf("%d / %d = %d \n",nilaiA,nilaiB,hasil);

        // perkalian
        hasil = nilaiA * nilaiB;
        System.out.printf("%d * %d = %d \n",nilaiA,nilaiB,hasil);
    }

}
