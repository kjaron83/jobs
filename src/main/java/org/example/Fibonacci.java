package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public List<Integer> recursive(int n) {
        if ( n < 1 )
            throw new IllegalArgumentException("Parameter n cannot be less than one");

        if ( n == 1 )
            return new ArrayList<>(Arrays.asList(0));

        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1));
        recursiveImpl(n - 2, list);
        return list;
    }

    private void recursiveImpl(int n, List<Integer> list) {
        if ( n == 0 )
            return;

        int s = list.size();
        int a = list.get(s - 2);
        int b = list.get(s - 1);
        list.add(a + b);

        recursiveImpl(n - 1, list);
    }

    public List<Integer> iterative(int n) {
        if ( n < 1 )
            throw new IllegalArgumentException("Parameter n cannot be less than one");

        if ( n == 1 )
            return new ArrayList<>(Arrays.asList(0));

        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1));
        for ( int i = 2; i < n; i++ ) {
            int a = list.get(i - 2);
            int b = list.get(i - 1);
            list.add(a + b);
        }

        return list;
    }

}
