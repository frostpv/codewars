package cata7;

import java.math.BigInteger;

public class BinarySxore {
    public static BigInteger sxore(BigInteger num) {
        return new BigInteger[]
                {num, BigInteger.ONE, num.add(BigInteger.ONE), BigInteger.ZERO}[num.mod(BigInteger.valueOf(4)).intValue()];
    }
}
