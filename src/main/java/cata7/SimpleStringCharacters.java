package cata7;

public class SimpleStringCharacters {
    private static final String UPPER_CASE_REG = "[^A-Z]";
    private static final String LOWER_CASE_REG = "[^a-z]";
    private static final String NUMBERS_REG = "[^0-9]";
    private static final String NUMBERS_AND_LETTERS_REG = "[\\w]";

    public static int[] Solve(String word) {
        return new int[]{
                getNumber(UPPER_CASE_REG, word),
                getNumber(LOWER_CASE_REG, word),
                getNumber(NUMBERS_REG, word),
                getNumber(NUMBERS_AND_LETTERS_REG, word),
        };
    }

    private static int getNumber(String regex, String word) {
        return word.replaceAll(regex, "").length();
    }
}
