package cata7;

import java.util.ArrayList;;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleSort {
    public static Object[] dbSort(Object[] a) {
        List<Object> instanceOfInteger = new ArrayList<>();
        List<Object> instanceOfStrings = new ArrayList<>();

        for (Object o : a) {
            if (o instanceof String) {
                instanceOfStrings.add(o);
            } else {
                instanceOfInteger.add(o);
            }
        }

        instanceOfInteger = instanceOfInteger.stream()
                .sorted()
                .collect(Collectors.toList());
        instanceOfStrings = instanceOfStrings
                .stream()
                .sorted()
                .collect(Collectors.toList());


        instanceOfInteger.addAll(instanceOfStrings);
        return instanceOfInteger.toArray();
    }
}
