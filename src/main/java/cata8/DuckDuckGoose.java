// https://www.codewars.com/kata/582e0e592029ea10530009ce/train/java
//The objective of Duck, duck, goose is to walk in a circle,
// tapping on each player's head until one is chosen.
// Task: Given an array of Player objects (an array of associative arrays in PHP)
// and an index (1-based), return the name of the chosen Player(name is a
// property of Player objects, e.g Player.name)

package cata8;

public class DuckDuckGoose {
}
class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose-1)%players.length].name;
    }
}

class Player {
    public String name;
}