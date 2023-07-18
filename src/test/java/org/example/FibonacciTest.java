package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private static final List<Integer> sequence = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
            28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269);

    private static final Fibonacci instance = new Fibonacci();

    @Test
    void recursive() {
        assertEquals(sequence, instance.recursive(sequence.size()));
    }

    @Test
    void iterative() {
        assertEquals(sequence, instance.iterative(sequence.size()));
    }



}