package com.learnProgramming.advance;

public class SwitchCaseEnum {
    public static void main(String[] args) {

        Colors colors = Colors.GREEN;
        switch (colors) {
            case RED :
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }
    }
}
