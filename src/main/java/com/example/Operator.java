package com.example;

public class Operator {
    public static void main(String[] args) {
        int num = 7;
        int result = ++num;
        System.out.println("Initial number: " + result);

        int x =6;
        int y = 4;
        double a= 3.5;
        double b= 2.5;
        boolean result1;
        if(x >= y || a >= b) {
            result1 = true;
        } else {
            result1 = false;
        }
        System.out.println(result1);
    }
}
