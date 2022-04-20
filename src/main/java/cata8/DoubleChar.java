package cata8;

public class DoubleChar {
    public static String doubleChar(String stringValue){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = stringValue.toCharArray();
        for (char aChar : chars) {
            stringBuilder.append(aChar).append(aChar);
        }
        return stringBuilder.toString();
    }
}
