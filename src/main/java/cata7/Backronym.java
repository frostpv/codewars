package cata7;

import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Backronym {
    private static Map<String, String> DICTIONARY;

    public static void main(String[] args) {
        System.out.println(Backronym.makeBackronym("dgm"));
    }

    public static String makeBackronym(String acronym) {
        addDictionary();
        return acronym == null || acronym.isEmpty() ? "" : Arrays.stream(acronym.toUpperCase().split(""))
                .map(DICTIONARY::get)
                .collect(Collectors.joining(" "));
    }

    private static void addDictionary(){
        DICTIONARY = new HashMap<>();
        DICTIONARY.put("D", "disturbing");
        DICTIONARY.put("G", "gregarious");
        DICTIONARY.put("M", "mustache");
        DICTIONARY.put("L", "literal");
        DICTIONARY.put("K", "klingon");
        DICTIONARY.put("J", "joke");
        DICTIONARY.put("I", "ingestable");
        DICTIONARY.put("N", "newtonian");
        DICTIONARY.put("T", "turn");
        DICTIONARY.put("E", "eager");
        DICTIONARY.put("R", "rant");
        DICTIONARY.put("S", "stylish");
        DICTIONARY.put("C", "confident");
        DICTIONARY.put("O", "oscillating");
        DICTIONARY.put("W", "weird");
        DICTIONARY.put("A", "awesome");
        DICTIONARY.put("B", "beautiful");
        DICTIONARY.put("Q", "queen");
        DICTIONARY.put("Y", "yogic");
        DICTIONARY.put("U", "underlying");
        DICTIONARY.put("P", "perfect");
        DICTIONARY.put("F", "fantastic");
        DICTIONARY.put("H", "hippy");
        DICTIONARY.put("Z", "zero");
        DICTIONARY.put("X", "xylophone");
        DICTIONARY.put("V", "volcano");
    }
}
