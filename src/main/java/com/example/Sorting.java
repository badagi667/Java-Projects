package com.example;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(num);
        bubbleSort(num, n);
        System.out.println("Sorted array (Bubble Sort):");
        printArray(num);
        selectionSort(num, n);
        System.out.println("Sorted array (Selection Sort):");
        printArray(num);
        insertionSort(num, n);
        System.out.println("Sorted array (Insertion Sort):");
        printArray(num);
        sc.close();

    }
    public static void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                 for (int num : arr) {
                    System.out.print(num + " ");
                }
                 System.out.println(); // New line after each pass

            }
        }
    }
    public static void selectionSort(int[] arr, int n) {
     
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            for (int num : arr) {
            System.out.print(num + " ");
            }
            System.out.println(); // New line after each pass

        }
    }
    public static void insertionSort(int[] arr, int n) {
      
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                
            }
            arr[j + 1] = key;
// New line after each pass
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); 
        }
        System.out.println(); // New line after printing the array
    }
}