// HELP! Jason can't find his textbook!
// It is two days before the test date, and Jason's textbooks are all out of order!
// Help him sort a list (ArrayList in java) full of textbooks by subject, so he can
// study before the test.
// The sorting should NOT be case sensitive
package cata8;

import java.util.List;
import java.util.stream.Collectors;

class Sorter {
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
    }
}