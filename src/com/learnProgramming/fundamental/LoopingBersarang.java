package com.learnProgramming.fundamental;

public class LoopingBersarang {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print("x ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i=0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print("x ");
                if(i==j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i=0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print("x ");
                if((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        System.out.print("Others");

        System.out.print("\n");
        
        System.out.print("\n");

        // segitiga
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segita terbalik
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("x ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // penggabungan segitiga
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("x ");
                }
            } else {
                for (int j = 0; j < 9 - i; j++) {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
