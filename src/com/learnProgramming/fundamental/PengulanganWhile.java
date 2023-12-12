package com.learnProgramming.fundamental;

public class PengulanganWhile {
    public static void main(String[] args) {

        int a = 8;
        boolean condition = true;

        while (condition) {
            System.out.println("While loop ke-"+a);
            a++;
            if (a == 15) {
                condition=false;
            }
        }
    }
}
