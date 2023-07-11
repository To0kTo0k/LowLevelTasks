package org.example;

public class ArrayReversingOperations {
    public int[] arrayReverse(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int iterations = array.length / 2;
        for (int i = 0; i < iterations; i++) {
            swap(array, i, array.length - 1 - i);
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }
}
