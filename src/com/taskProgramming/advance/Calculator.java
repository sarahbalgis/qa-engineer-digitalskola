package com.taskProgramming.advance;

class Calculator {

    //Penjumlahan
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    //Pengurangan
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //Perkalian
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //Pembagian
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Can't divide by zero!");
            return Double.NaN;
        }
    }

    //Modulus
    public double modulus(double num1, double num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Modulus by zero!");
            return Double.NaN;
        }
    }
}
