package com.jalasoft.coding.jonas;

public class SpinWords {
    public static String evaluate(String input){
        int numberOfWords = countWords(input);
        String[] splitStr = input.split("\\s+");
        for (int i = 0; i <numberOfWords; i++) {
            if (splitStr[i].length()>=5){
                String convertWord = reverseWord(splitStr[i]);
                splitStr[i] = convertWord;
            }
        }
        String finalResult = String.join(" ", splitStr);
        return finalResult;
    }

    private static int countWords(String input){
        int count=0;

        char ch[]= new char[input.length()];
        for(int i=0;i<input.length();i++)
        {
            ch[i]= input.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
    private static String reverseWord(String word){
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }
}
