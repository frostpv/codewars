package cata7;

import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .map(arr -> arr[0] - arr[1])
                .mapToInt(Integer::intValue)
                .sum();
    }
}
