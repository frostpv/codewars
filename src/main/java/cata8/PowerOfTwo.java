package cata8;

public class PowerOfTwo {
    public static long[] powersOfTwo(int number){
        if (checkNumber(number)) {
            long[] longs = new long[number + 1];
            longs[0] = 1;

            for (int l = 0; l < longs.length-1; l++) {
                longs[l+1] = longs[l] * 2;
            }
            return longs;
        }
        return new long[]{};
    }

    private static boolean checkNumber(int number){
        return number >= 0;
    }
}
