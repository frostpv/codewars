package cata7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.trim().equals("")){
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
    }
}
