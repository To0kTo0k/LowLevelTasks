package org.example;

public class Main {
    public static void main(String[] args) {
        PalindromeOperations operations = new PalindromeOperations();

        System.out.println("Input string:");
        String first = operations.readString();
        System.out.println(operations.palindromeStringCheck(first));

        int second = 1234321;
        System.out.println(operations.palindromeNumberCheck(second));
    }
}