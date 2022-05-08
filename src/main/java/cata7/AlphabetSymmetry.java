package cata7;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr){
       return Stream.of(arr)
               .mapToInt(str -> (int) IntStream.range(0 ,str.length())
                       .filter(i -> i == str.toUpperCase().charAt(i)-65)
                       .count())
               .toArray();
    }
}
