package cata7;

public class DotCalculator {
    private static final String ADDITION = "[+]";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "[*]";
    private static final String DIVISION = "//";

    public static String calc(String txt){
        String delimiter = findDelimiter(txt);
        int resultNumber = resultNumber(delimiter, txt);

        if (resultNumber<=0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < resultNumber; i++) {
            stringBuilder.append(".");
        }
        return stringBuilder.toString();
    }

    private static int resultNumber(String delimiter, String txt){
        if (ADDITION.equals(delimiter)){
            return txt.split(ADDITION)[0].trim().length() + txt.split(ADDITION)[1].trim().length();
        }

        if (SUBTRACTION.equals(delimiter)){
            return txt.split(SUBTRACTION)[0].trim().length() - txt.split(SUBTRACTION)[1].trim().length();
        }

        if (MULTIPLICATION.equals(delimiter)){
            return txt.split(MULTIPLICATION)[0].trim().length() * txt.split(MULTIPLICATION)[1].trim().length();
        }

        if (DIVISION.equals(delimiter)){
            int length = txt.split(DIVISION)[1].trim().length();
            if(length == 0) {
                return 0;
            }

            return txt.split(DIVISION)[0].trim().length() / length;
        }

        return 0;
    }

    private static String findDelimiter(String txt) {
        if (txt.contains(ADDITION)) {
            return ADDITION;
        }

        if (txt.contains(SUBTRACTION)) {
            return SUBTRACTION;
        }

        if (txt.contains(MULTIPLICATION)) {
            return MULTIPLICATION;
        }

        if (txt.contains(DIVISION)) {
            return DIVISION;
        }

        return "";
    }
}
