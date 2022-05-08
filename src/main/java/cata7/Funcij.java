package cata7;

import java.math.BigInteger;

public class Funcij {
    public static BigInteger sumin(int n) {
        return BigInteger.valueOf((long) n * (n +1) * (2L * n + 1) / 6);
    }
    public static BigInteger  sumax(int n) {
        return BigInteger.valueOf((long) n * n * n - (long) n * (n -1) * (2L * n - 1) / 6);
    }
    public static BigInteger  sumsum(int n) {
        return sumin(n).add(sumax(n));
    }
}
