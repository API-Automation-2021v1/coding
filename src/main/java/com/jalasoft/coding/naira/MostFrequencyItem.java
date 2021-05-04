package com.jalasoft.coding.naira;

/**
 * @author: Naira Romero
 */
public class MostFrequencyItem {
    private MostFrequencyItem() { }

    public static int frequencyItem(final int [] numbers){
        int maxCounter = 0;
        if (numbers.length == 0) {
            return 0;
        }else{
            for (int i = 0; i <= numbers.length-1; i++) {
                int counter = 1;
                int element= numbers[i];
                for (int j = i+1; j <= numbers.length-1; j++ ){
                    if (element == numbers[j])
                        counter ++;
                    if((numbers.length - 1 == j ) && (counter > maxCounter)) {
                        maxCounter = counter;
                        int index = i;
                    }
                }
            }
        }
        return maxCounter;
    }
}
