package org.example;

import java.util.Objects;

public class BinarySearch {

    public int recursive(Comparable[] src, Comparable find) {
        return recursive(src, 0, src.length - 1, find);
    }

    private int recursive(Comparable[] src, int from, int to, Comparable find) {
        if ( from > to )
            return -1;

        int index = to + ( from - to ) / 2;
        int value = src[index].compareTo(find);

        if ( value == 0 )
            return index;
        else if ( value < 0 )
            return recursive(src, index + 1, to, find);
        else
            return recursive(src, from, index - 1, find);
    }

    public int iterative(Comparable[] src, Comparable find) {
        int from = 0;
        int to = src.length - 1;

        while ( from <= to ) {
            int index = to + ( from - to ) / 2;
            int value = src[index].compareTo(find);

            if ( value == 0 )
                return index;
            else if ( value < 0 )
                from = index + 1;
            else
                to = index - 1;
        }

        return  -1;
    }

}
