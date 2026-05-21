package com.example;

import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("-------------------"); 
        Pattern0(n);
        System.out.println("-------------------");   
        Pattern1(n);
        System.out.println("-------------------");   
        Pattern2(n);
        System.out.println("-------------------");   
        Pattern3(n);
        System.out.println("-------------------");   
        Pattern4(n);
        System.out.println("-------------------");
        Pattern5(n);
        System.out.println("-------------------");
        Pattern6(n);
        System.out.println("-------------------");
        sc.close();
    }
    public static void Pattern0(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");        
            }
            System.out.println();
        }
    }
    public static void Pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");        
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");        
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){
                System.out.print("* ");        
            }
            System.out.println();
        }
    }
    //version 2 for pattern 3
    public static void Pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i+1; j++){
                System.out.print("* ");        
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j+ " ");        
            }
            System.out.println();
        }
    }
    public static void Pattern6(int n){
        for (int i = 0; i < n; i++) {
            //Spcace
            for (int j = 0; j < n-i-1;j++){
                System.out.print(" ");        
            }
            //Star
            for (int j = 0; j < 2*i+1;j++){
                System.out.print("*");        
            }
            //Spcace
            for (int j = 0; j < n-i-1;j++){
                System.out.print(" ");        
            }
            System.out.println();
        }
    }

}
