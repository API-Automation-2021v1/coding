package com.jalasoft.coding.jorge;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class SpinWords {
    private SpinWords() {
        //Constructor
    }

    public static String reverse(final String input) {
        String res = "";
        if (input.isEmpty()) {
            return res;
        }
       /*if (input.length() >= 5) {
            return new StringBuilder(input).reverse().toString();
        }*/
        /*if(input.length()>= 5) {
            for (int i = input.length() -1; i >= 0; i--) {
                res = res + input.charAt(i);
            }
        }*/
        return Pattern.compile(" +").splitAsStream(input)
                .map(word -> word.length() < 5 ? word : new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

    }
}
