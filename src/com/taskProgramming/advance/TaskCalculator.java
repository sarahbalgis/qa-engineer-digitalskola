package com.taskProgramming.advance;

import java.util.Scanner;

public class TaskCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Homework 4 - Programming Advance");
        System.out.println("Tugas : Membuat calculator menggunakan conditional statement atau Switch Case");
        System.out.println("Nama: Siti Sarah Balgis");
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan Angka Kedua: ");
        double num2 = scanner.nextDouble();

        char operator;

        do {
            System.out.print("Masukkan Operator (+, -, *, /, %): ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    num1 = calculator.add(num1, num2);
                    break;
                case '-':
                    num1 = calculator.subtract(num1, num2);
                    break;
                case '*':
                    num1 = calculator.multiply(num1, num2);
                    break;
                case '/':
                    num1 = calculator.divide(num1, num2);
                    break;
                case '%':
                    num1 = calculator.modulus(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid Operator, Silakan masukkan kembali.");
                    System.out.print("\n");
            }
        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%');

        System.out.println("Hasil: " + num1);

    }
}
