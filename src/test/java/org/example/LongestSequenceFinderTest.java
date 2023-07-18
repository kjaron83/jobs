package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSequenceFinderTest {

    @Test
    void find() {
        LongestSequenceFinder instance = new LongestSequenceFinder();

        assertEquals(null, instance.find(null));
        assertEquals(null, instance.find(""));
        assertEquals("a", instance.find("a"));
        assertEquals("a", instance.find("ab"));
        assertEquals("bb", instance.find("abb"));
        assertEquals("bb", instance.find("abbc"));
        assertEquals("bb", instance.find("abbcc"));
        assertEquals("ccc", instance.find("abbccc"));
        assertEquals("ccc", instance.find("abbcccd"));
    }

}