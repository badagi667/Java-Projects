package com.example;

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion
        int intVar = 100;
        double doubleVar = intVar; // int to double
        System.out.println("Implicit Conversion:");
        System.out.println("Integer: " + intVar);
        System.out.println("Converted to Double: " + doubleVar);

        // Explicit Conversion
        double anotherDouble = 99.99;
        int anotherInt = (int) anotherDouble; // double to int
        System.out.println("\nExplicit Conversion:");
        System.out.println("Double: " + anotherDouble);
        System.out.println("Converted to Integer: " + anotherInt);

        // String to Integer
        String strNum = "123";
        int parsedInt = Integer.parseInt(strNum);
        System.out.println("\nString to Integer:");
        System.out.println("String: " + strNum);
        System.out.println("Parsed Integer: " + parsedInt);

        // Integer to String
        int num = 456;
        String strFromInt = Integer.toString(num);
        System.out.println("\nInteger to String:");
        System.out.println("Integer: " + num);
        System.out.println("Converted String: " + strFromInt);
    }
}
