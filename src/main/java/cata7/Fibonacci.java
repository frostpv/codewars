package cata7;

import java.util.stream.Stream;

public class Fibonacci {
    public static long fib (int n){

        return Stream.iterate(new long[]{1,1}, i -> new long[]{i[1],i[0] + i[1]})
                .limit(n)
                .reduce((x,y) -> y)
                .orElse(new long[1])[0];
    }
}
