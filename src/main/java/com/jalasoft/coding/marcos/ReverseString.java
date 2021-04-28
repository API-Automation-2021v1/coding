package com.jalasoft.coding.marcos;

public final class ReverseString {

    private ReverseString() {
        // Default constructor.
    }

    /**
     * Reverses string according to input.
     *
     * @param input input string.
     * @return reversed string.
     */
    public static String reverse(final String input) {
        String res = "";
        if (input.isEmpty()) {
            return res;
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            res = res + input.charAt(i);
        }
        return res;
    }
}
