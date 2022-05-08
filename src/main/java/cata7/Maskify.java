package cata7;

public class Maskify {
    private static final String REGEXP = ".(?=.{4})";
    private static final String REPLACE_SYMBOL = "#";

    public static String maskify(String str) {
        return str.replaceAll(REGEXP,REPLACE_SYMBOL);
    }
}
