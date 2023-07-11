package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeleteDuplicatesOperations operations = new DeleteDuplicatesOperations();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = scanner.nextInt();
        System.out.println("Input elements of array:");
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        array = operations.deleteDuplicates(array);
        System.out.println("Result of duplicates deleting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}