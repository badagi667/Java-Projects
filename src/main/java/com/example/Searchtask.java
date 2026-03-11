package com.example;
public class Searchtask {
    public static void main(String[] args) {
        int[] nums = {5,6,7,23,37,58,69,78,89,90};
        int target = 5;
        int result = linearSearch(nums, target);
        int result1 = binaerysearch(nums, target); // Example of searching for an element that is not in the array
        int result2 = binaerysearchrecurcive(nums, target, 0, nums.length - 1); // Example of searching for an element that is not in the array
        System.out.println("Linear search result: " + result);
        System.out.println("Binary search result: " + result1);
        System.out.println("Binary search result recurscive: " + result2);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
    }
}
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }



  public static int binaerysearch(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if(nums[mid] == target){
            return mid; // Return the index of the target element
        } else if (nums[mid] < target) {
            left = mid + 1; // Search in the right half
        } else {
            right = mid - 1; // Search in the left half
        }
        
    }
    return -1; // Return -1 if the target element is not found
  } 
  public static int binaerysearchrecurcive(int[] nums, int target, int left, int right){
    if (left > right) {
        return -1; // Base case: target not found
    }
    if(left <= right){
        int mid = (left + right) / 2;
        if(nums[mid] == target){
            return mid; // Return the index of the target element
        } else if (nums[mid] < target) {
            return binaerysearchrecurcive(nums, target, mid + 1, right); // Search in the right half
        } else {
            return binaerysearchrecurcive(nums, target, left, mid - 1); // Search in the left half
        }
    }
    return -1; // Return -1 if the target element is not found
  }
}