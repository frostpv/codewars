package cata8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestIdClass {
    private static final int MAX_INT_VALUE = 2147483647;

    public static int nextId(int[] ids) {
        List<Integer> collect = Arrays.stream(ids)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < MAX_INT_VALUE; i++) {
            if(!collect.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}

