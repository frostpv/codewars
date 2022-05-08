package cata7;

import static java.util.stream.IntStream.range;

public class DontGiveFive {
    public static int dontGiveMeFive(int start, int end) {
        return (int) range(start, ++end)
                .filter(num ->!(num + "").contains("5"))
                .count();
    }
}
