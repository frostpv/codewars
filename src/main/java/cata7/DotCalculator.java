package cata7;

public class DotCalculator {
    //private static final String ADDI = "*";
    private static final String ADDI_REGEX = "[*]";
    private static final String SUBT = "-";
    //private static final String MULT = "*";
    private static final String MULT_REGEX = "[*]";
    private static final String DIVI = "//";

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
        int left = 0;
        int right = 1;

       // if (ADDI.equals(delimiter)){
        //    return txt.split(ADDI)[left].trim().length() + txt.split(ADDI)[right].trim().length();
       // }

        if (SUBT.equals(delimiter)){
            return txt.split(SUBT)[left].trim().length() - txt.split(SUBT)[right].trim().length();
        }

       // if (MULT.equals(delimiter)){
        //    return txt.split(MULT)[left].trim().length() * txt.split(MULT)[right].trim().length();
       // }

        if (DIVI.equals(delimiter)){
            int length = txt.split(DIVI)[right].trim().length();
            return length == 0
                    ? 0
                    : txt.split(DIVI)[left].trim().length() / length;
        }

        return 0;
    }

    private static String findDelimiter(String txt) {
        if (txt.contains(ADDI_REGEX)) {
            //return ADDI;
        }

        if (txt.contains(SUBT)) {
            return SUBT;
        }

        if (txt.contains(MULT_REGEX)) {
           // return MULT;
        }

        if (txt.contains(DIVI)) {
            return DIVI;
        }

        return "";
    }
}
