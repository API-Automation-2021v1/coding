package Weimar;

import java.util.Arrays;

/**
 * Frequency of numbers in a array.
 */
public final class FrequentItem {
    /**
     * Constructor.
     */
    private FrequentItem() {
    }

    /**
     * This class is to resolve the task2.
     *
     * @param collection of numbers to count the max num which is repeated.
     * @return a number.
     */
    public static int mostFrequentItemCount(final int[] collection) {
        int countnum = 1;
        int maxnum = 0;
        Arrays.sort(collection);
        for (int i = 1; i <= (collection.length - 1); i++) {
            if (collection[i - 1] == collection[i]) {
                countnum++;
            } else if (maxnum < countnum) {
                maxnum = countnum;
                countnum = 0;
            }
        }
        return maxnum;
    }
}
