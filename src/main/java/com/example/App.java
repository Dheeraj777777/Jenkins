package com.example;

public class App {
    public static String checkNumber(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + " is " + checkNumber(number));
    }
}
