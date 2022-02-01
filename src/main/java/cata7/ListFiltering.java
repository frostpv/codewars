package cata7;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    /**
     * In this kata you will create a function that takes a list of non-negative
     * integers and strings and returns a new list with the strings filtered out.
     * **/
    public static List filterList(final List list) {

        return (List) list.stream()
                .filter(o -> o.getClass().toString().equals("class java.lang.Integer"))
                .collect(Collectors.toList());
    }
}
