package cata8;

import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {

    public static long sumMul(int currentNumber, int maxNumber) {
        isAvailable(currentNumber,maxNumber);
        int number = currentNumber;

        Set<Integer> integerSet = new HashSet<>();

        while (currentNumber < maxNumber) {
            integerSet.add(currentNumber);
            currentNumber = currentNumber + number;
        }

        return integerSet.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static void isAvailable(int currentNumber, int maxNumber) {
        if (currentNumber <= 0 || maxNumber <= 0) throw new IllegalArgumentException();
    }
}
