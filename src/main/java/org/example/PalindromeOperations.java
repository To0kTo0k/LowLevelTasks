package org.example;

import java.util.Scanner;

public class PalindromeOperations {

    public String readString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public boolean palindromeStringCheck(String first) {
        String second = reverseString(first);

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String reverseString(String string) {
        char[] symbols = string.toCharArray();
        StringBuilder reverseSymbols = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            reverseSymbols.append(symbols[symbols.length - i - 1]);
        }
        return reverseSymbols.toString();
    }

    public boolean palindromeNumberCheck(int first) {
        int second = reverseNumber(first);

        while (first > 0) {
            if (first % 10 != second % 10) {
                return false;
            }
            first = first / 10;
            second = second / 10;
        }
        return true;
    }

    public int reverseNumber(int number) {
        int reverseDigits = 0;
        while (number > 0) {
            reverseDigits = reverseDigits * 10 + (number % 10);
            number = number / 10;
        }
        return reverseDigits;
    }
}
