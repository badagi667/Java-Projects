package com.example;

public class datatype {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 20.5;
        float floatVar = 15.5f;
        char charVar = 'A';
        String stringVar = "Hello, World!";
        boolean boolVar = true;
        

        //litrals
        int num1= 0b101;
        double num2 = 12e10;
        char c= 'a';
        c++;
        System.out.println("Integer: " + intVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("String: " + stringVar);
        System.out.println("Boolean: " + boolVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Binary Literal (0b101): " + num1);
        System.out.println("Scientific Notation Literal (12e10): " + num2);
        System.out.println("Character after increment: " + c);
    }
}
