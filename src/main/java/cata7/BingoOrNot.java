package cata7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BingoOrNot {
    private static char[] bingo = new char[]{'B', 'I', 'N', 'G', 'O'};

    public static String bingo(int[] numberArray) {
        for (char c : bingo) {
            if (!Arrays.stream(numberArray).boxed().collect(Collectors.toList()).contains((int) c - 64)) {
                return "LOSE";
            }
        }
        return "WIN";
    }
}
