package org.example;

public class StringReversingOperations {
    public String stringBuilderReverse(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        return new StringBuilder(string).reverse().toString();
    }

    public String charArrayReverse(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        char[] array = string.toCharArray();
        char[] reverseArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : reverseArray) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
