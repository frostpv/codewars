package cata8;

public class WideMouthedFrog {
    public static final String ALLIGATOR = "alligator";

    public static String mouthSize(String animal) {
        return animal.equalsIgnoreCase(ALLIGATOR)
                ? "small"
                : "wide";
    }
}
