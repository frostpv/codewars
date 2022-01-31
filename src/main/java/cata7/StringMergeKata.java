package cata7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMergeKata {

    /***
     * Given two words and a letter, return a single word that's a combination of both words,
     * merged at the point where the given letter first appears in each word. The returned word
     * should have the beginning of the first word and the ending of the second,
     * with the dividing letter in the middle. You can assume both words will contain
     * the dividing letter.
     * */

    public static String stringMerge(String s1, String s2, char letter) {
        boolean indicator = true;
        StringBuilder builder = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (c == letter) {
                indicator = false;
                break;
            }
            builder.append(c);
        }

        for (char c : s2.toCharArray()) {
            if (c == letter) {
                indicator = true;
            }
            if (indicator) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
