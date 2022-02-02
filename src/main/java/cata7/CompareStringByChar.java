package cata7;

import java.util.Arrays;

public class CompareStringByChar {

    public static void main(String[] args) {
        System.out.println(getSummOfChars(" "));
    }

    public static boolean compare(String s1, String s2) {
        if(s1==null || s1.equals("") || s1.matches("\\W") || s1.matches("\\d")){
            return true;
        }

        if(s2==null || s2.equals("") || s2.matches("\\W") || s2.matches("\\d")){
            return true;
        }

        return getSummOfChars(s1.toUpperCase()) == getSummOfChars(s2.toUpperCase());
    }

    private static int getSummOfChars(String str) {
        char[] chars = str.toCharArray();
        int res = 0;
        for (char aChar : chars) {
            if (aChar>=65 && aChar<=87) {
                aChar = 0;
            }
            if(aChar>=97 && aChar<=119){
                aChar = 0;
            }
            res = res + aChar;
        }
        return res;
    }
}
