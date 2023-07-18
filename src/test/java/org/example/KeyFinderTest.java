package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeyFinderTest {

    @Test
    void ketKeyPairsOfSameValues() {
        KeyFinder instance = new KeyFinder();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 2);
        map.put("d", 3);
        map.put("e", 4);
        map.put("f", 5);
        map.put("g", 6);
        map.put("h", 2);
        map.put("i", 2);
        map.put("j", 3);
        map.put("k", 4);
        map.put("l", 4);
        map.put("m", 4);
        map.put("n", 7);
        map.put("o", 8);

        List expected = Arrays.asList(
                new KeyFinder.Pair("a", "b"),
                new KeyFinder.Pair("c", "h"),
                new KeyFinder.Pair("c", "i"),
                new KeyFinder.Pair("d", "j"),
                new KeyFinder.Pair("e", "k"),
                new KeyFinder.Pair("e", "l"),
                new KeyFinder.Pair("e", "m"),
                new KeyFinder.Pair("h", "i"),
                new KeyFinder.Pair("k", "l"),
                new KeyFinder.Pair("k", "m"),
                new KeyFinder.Pair("l", "m")
        );

        List actual = instance.ketKeyPairsOfSameValues(map);

        assertEquals(expected, actual);
    }

}