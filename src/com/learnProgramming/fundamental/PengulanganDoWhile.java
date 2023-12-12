package com.learnProgramming.fundamental;

public class PengulanganDoWhile {
    public static void main(String[] args) {

        System.out.println("Ini adalah awal program");

        int a = 0;
        boolean condition = true;
        do {
            a++;
            System.out.println("Do While ke-"+a);
            if(a == 3){
                condition = false;
            }
        } while (condition);

        System.out.println("Ini adalah akhir program");
    }
}
