package cata7;

public class InsertDashClass {

    public static String insertDash(int num) {
        String numberString = "" + num;
        char[] chars = numberString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Character character = null;
        for (char aChar : chars) {
            if (character == null){
                character = aChar;
                stringBuilder.append(character);
                continue;
            }

            if (!isOdd(Integer.valueOf(character)) && !isOdd(Integer.valueOf(aChar))) {
                stringBuilder.append("-");
            }
            stringBuilder.append(aChar);
            character = aChar;
        }
        return stringBuilder.toString();
    }

    private static boolean isOdd(int num) {
        return num%2 == 0;
    }
}
