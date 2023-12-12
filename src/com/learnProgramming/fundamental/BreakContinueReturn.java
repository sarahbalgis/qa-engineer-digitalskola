package com.learnProgramming.fundamental;

public class BreakContinueReturn {
    public static void main(String[] args) {

        // break, continue, return

        int a = 0;
        while (true) {
            a++;
            if (a == 8) {
                break;
            } else if (a == 5) {
                continue;
            } else if (a==7) {
                return;
            }
            System.out.println("Looping ke-"+a);
        }

    }

}
