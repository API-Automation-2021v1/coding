package com.jalasoft.coding.milena;
public final class SpinWords {
    public static String spinWords( String phrase) {

        String words = "";
        /* Here  splits a string in several strings based on the
         * delimiter by space
         */
        String[] phaseSplited = phrase.split(" ");

        // If the Phrase is empty

        if (phrase.isEmpty()) {
            return words;
        }
        // Here we spin the word only if the characters are more than 5
        for (int i = 0; i < phaseSplited.length; i++)
            if (!(phaseSplited[i].length() <= 5)) {
                phaseSplited[i] = new StringBuilder(phaseSplited[i]).reverse().toString();
            }
        words = String.join(" ", phaseSplited);
        return words;
    }
}
