package cata7;

public class MiddleCharacter {
    private static final int NUM = 2;

    public static String getMiddle(String word) {
        int middleOfWord = word.length() / NUM;

        if(!isOdd(word)) {
            return word.substring(middleOfWord, middleOfWord+1);
        }
        return word.substring(middleOfWord-1, middleOfWord+1);
    }

    private static boolean isOdd(String word) {
        return word.length() % NUM == 0;
    }
}
