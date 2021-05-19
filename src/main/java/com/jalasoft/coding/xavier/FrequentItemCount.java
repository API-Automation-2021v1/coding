package com.jalasoft.coding.xavier;

/**
 * Verify some library method.
 */
public class FrequentItemCount {
    /**
     * Verify some library method.
     */
    public static int mostFrequentItemCount(int[] collection) {
        int count=0;
        int element;
        for (int k : collection) {
            element=k;
            int tempCount=0;
            for (int i : collection)
                if (i == element)
                    tempCount++;
            if (tempCount > count)
                count=tempCount;
        }
        return count;
    }
}
