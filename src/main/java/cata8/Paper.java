package cata8;

public class Paper {
    public static int paperWork(int numbers, int copies) {
        return numbers <= 0 || copies <= 0
                ? 0
                : numbers * copies;
    }
}
