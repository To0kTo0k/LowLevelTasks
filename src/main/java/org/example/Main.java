package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringReversingOperations operations = new StringReversingOperations();

        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Reversing with StringBuilder:\n" + operations.stringBuilderReverse(string));
        System.out.println("Reversing with array of char:\n" + operations.charArrayReverse(string));
    }
}