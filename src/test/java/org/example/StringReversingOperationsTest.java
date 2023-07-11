package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringReversingOperationsTest {

    StringReversingOperations operations = new StringReversingOperations();

    @Test
    void stringBuilderReverse() {
        assertEquals("abcde", operations.stringBuilderReverse("edcba"));
    }

    @Test
    void stringBuilderReverseNull() {
        assertNull(operations.stringBuilderReverse(null));
    }

    @Test
    void stringBuilderReverseEmpty() {
        assertNull(operations.stringBuilderReverse(""));
    }

    @Test
    void charArrayReverse() {
        assertEquals("abcde", operations.charArrayReverse("edcba"));
    }

    @Test
    void charArrayReverseNull() {
        assertNull(operations.charArrayReverse(null));
    }

    @Test
    void charArrayReverseEmpty() {
        assertNull(operations.charArrayReverse(""));
    }
}