//A wolf in sheep's clothing Wolves have been reintroduced to Great Britain.
// You are a sheep farmer, and are now plagued by wolves which pretend to be sheep.
// Fortunately, you are good at spotting them.
//
//Warn the sheep in front of the wolf that it is about to be eaten.
// Remember that you are standing at the front of the queue which is at the end of the array:
package cata8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sheeps {
}

class ZywOo {

    public static String warnTheSheep(String[] array) {
        List <String> lst = Arrays.stream(array)
                .collect(Collectors.toList());
        return lst.indexOf("wolf") == array.length - 1 ? "Pls go away and stop eating my sheep" :
                "Oi! Sheep number " + (array.length - 1 - lst.indexOf("wolf")) +"! You are about to be eaten by a wolf!";
    }
}
