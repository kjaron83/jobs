package org.example;

public class LongestSequenceFinder {

    public String find(CharSequence src) {
        if ( src == null || src.isEmpty() )
            return null;

        int length = src.length();
        if ( length == 1 )
            return src.toString();

        String longest = null;
        StringBuilder sb = new StringBuilder().append(src.charAt(0));
        for ( int i = 1; i < length; i++) {
            char c = src.charAt(i);
            int sbLength = sb.length();
            if ( sb.charAt(sbLength - 1) == c ) {
                sb.append(c);
                continue;
            }

            if ( longest == null || sbLength > longest.length() )
                longest = sb.toString();

            sb.setLength(0);
            sb.append(c);
        }

        if ( longest == null || sb.length() > longest.length() )
            longest = sb.toString();

        return longest;
    }


}
