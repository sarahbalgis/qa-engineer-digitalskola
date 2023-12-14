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

        System.out.print("Masukkan Operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            case '%':
                result = calculator.modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Hasil: " + result);
    }

}

