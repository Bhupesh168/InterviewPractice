package com.practice;

class RotateArray { 
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        RotateArray rotate = new RotateArray(); 
        int arr[] = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}; 
        rotate.leftRotate(arr ,13,15); 
        rotate.printArray(arr, 15); 
    } 
} 