package cata7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShowMultiplesOf2Numbers {
}

class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        return IntStream.range(s1, s3)
                .filter(x -> x % s1 == 0)
                .filter(x -> x % s2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
