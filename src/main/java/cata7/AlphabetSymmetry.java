package cata7;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlphabetSymmetry {
    private static final int CHAR_VALUE = 65;

    public static int[] solve(String[] arr){
       return Stream.of(arr)
               .mapToInt(str -> (int) IntStream.range(0 ,str.length())
                       .filter(intValue -> intValue == getAnInt(str, intValue))
                       .count())
               .toArray();
    }

    private static int getAnInt(String str, int intValue) {
        return str.toUpperCase().charAt(intValue) - CHAR_VALUE;
    }
}
