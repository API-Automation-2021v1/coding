package Weimar;

public class SpinWords {
    /**
     * num max of the chars to spin a word.
     */
    public static final int NUM = 5;
    /**
     * This class is to resolve the task1.
     * @param sentence main function to spin a word.
     * @return a sentence.
     */
    public final String spinWords(final String sentence) {
        String[] sentenceArray;
        String invertedSentence = "";
        String word;
        String invertedWord;
        sentenceArray = sentence.split(" ");
        for (int i = 0; i <= (sentenceArray.length - 1); i++) {
            word = sentenceArray[i];
            if (word.length() >= NUM) {
                invertedWord = "";
                for (int j = (word.length() - 1); j >= 0; j--) {
                    invertedWord = invertedWord + word.charAt(j);
                }
                invertedSentence = invertedSentence + " " + invertedWord;
            } else {
                invertedSentence = invertedSentence + " " + word;
            }
        }
        return  invertedSentence.replaceFirst(" ", "");
    }
}
