package cata7;

import java.util.Arrays;

public class StrongNumber {
    private static final String STRONG_NUMBER = "STRONG!!!!";
    private static final String NOT_STRONG_NUMBER = "Not Strong !!";

    public static String isStrongNumber(int num) {
        if (num <= 0) {
            return STRONG_NUMBER;
        }

        int sum = Arrays.stream(getIntArrayFromString("" + num))
                .map(StrongNumber::getFactorialOfNumber)
                .sum();

        return sum == num
                ? STRONG_NUMBER
                : NOT_STRONG_NUMBER;
    }

    private static int[] getIntArrayFromString(String num) {
        int[] arr = new int[num.length()];
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            arr[i] = chars[i] - 48;
        }
        return arr;
    }

    private static int getFactorialOfNumber(int num) {
        return num != 1
                ? num * getFactorialOfNumber(num - 1)
                : 1;
    }
}
