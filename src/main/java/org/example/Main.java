package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayReversingOperations operations = new ArrayReversingOperations();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = scanner.nextInt();
        System.out.println("Input elements of array:");
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        array = operations.arrayReverse(array);
        System.out.println("Reverse array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}