package cata7;

import java.util.HashSet;
import java.util.Set;

public class Vowels {

    public static int getCount(String str) {
        Set<Character> letters = new HashSet<>();
        letters.add('a');
        letters.add('e');
        letters.add('i');
        letters.add('o');
        letters.add('u');

        int vowelsCount = 0;
        char[] chars = str.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (letters.contains(aChar)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
