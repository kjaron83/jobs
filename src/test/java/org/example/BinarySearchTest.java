package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private static final Comparable[] src = new Integer[]{0, 2, 5, 7, 9, 11, 13, 14, 15, 22, 30, 31, 32, 34, 37, 47, 51, 60};
    private static final int[] find = new int[]{0, 2, 3, 14, 15, 17, 50, 51, 52, 59, 60, 61};
    private static final int[] index = new int[]{0, 1, -1, 7, 8, -1, -1, 16, -1, -1, 17, -1};

    private static final BinarySearch instance = new BinarySearch();

    @Test
    void recursive() {
        assertEquals(-1, instance.recursive(new Integer[]{}, 1));

        for ( int i = 0; i < find.length; i++ ) {
            int value = instance.recursive(src, find[i]);
            assertEquals(index[i], value);
        }
    }

    @Test
    void iterative() {
        assertEquals(-1, instance.iterative(new Integer[]{}, 1));

        for ( int i = 0; i < find.length; i++ ) {
            int value = instance.iterative(src, find[i]);
            assertEquals(index[i], value);
        }
    }

}