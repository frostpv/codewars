package cata7;

public class SingleDigit {
    /**
     * The goal of this Kata is to reduce the passed integer to a single
     * digit (if not already) by converting the number to binary,
     * taking the sum of the binary digits, and if that sum is
     * not a single digit then repeat the process.
     * <p>
     * If the passed integer is already a single digit there is no need to reduce
     * For example given 5665 the function should return 5:
     */
    static int singleDigit(int n) {
        return n < 10 ? n : singleDigit(Integer.bitCount(n));
    }
}
