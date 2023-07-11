package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteDuplicatesOperationsTest {

    DeleteDuplicatesOperations operations = new DeleteDuplicatesOperations();

    @Test
    void deleteDuplicates() {
        assertEquals(1, operations.deleteDuplicates(new int[]{1, 1, 1}).length);
        assertEquals(1, operations.deleteDuplicates(new int[]{1, 1, 1})[0]);
    }

    @Test
    void deleteDuplicatesFromNull() {
        assertEquals(0, operations.deleteDuplicates(null).length);
    }
}