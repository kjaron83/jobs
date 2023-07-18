package org.example;

import java.util.*;

public class KeyFinder {

    public List<Pair> ketKeyPairsOfSameValues(Map map) {
        List<Pair> keyPairs = new ArrayList<>();
        if ( map == null )
            return keyPairs;

        int size = map.size();
        if ( size < 2 )
            return keyPairs;

        ArrayList keySet = new ArrayList(map.keySet());
        Collections.sort(keySet);

        for ( int i = 0; i < size - 1; i++ ) {
            for ( int j = i + 1; j < size; j++ ) {
                Object k1 = keySet.get(i);
                Object k2 = keySet.get(j);
                Object v1 = map.get(k1);
                Object v2 = map.get(k2);

                if ( Objects.equals(v1, v2 ) )
                    keyPairs.add(new Pair(k1, k2));
            }
        }

        return keyPairs;
    }


    public static class Pair {

        private final Object a;
        private final Object b;

        public Pair(Object a, Object b) {
            this.a = a;
            this.b = b;
        }

        public Object getA() {
            return a;
        }

        public Object getB() {
            return b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(a, pair.a) && Objects.equals(b, pair.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }

    }

}
