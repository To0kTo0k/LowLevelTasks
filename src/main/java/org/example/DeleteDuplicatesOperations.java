package org.example;

public class DeleteDuplicatesOperations {
    public int[] deleteDuplicates(int[] values) {
        if (values == null) {
            return new int[0];
        }
        for (int i = 0; i < values.length - 1; i++) {
            int j = i + 1;
            while (j < values.length) {
                if (values[i] == values[j]) {
                    values = deleteSymbolFromArray(values, j);
                } else {
                    j++;
                }
            }
        }
        return values;
    }

    private int[] deleteSymbolFromArray(int[] values, int position) {
        for (int i = position; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        int[] newValues = new int[values.length - 1];
        for (int i = 0; i < values.length - 1; i++) {
            newValues[i] = values[i];
        }
        return newValues;
    }
}
