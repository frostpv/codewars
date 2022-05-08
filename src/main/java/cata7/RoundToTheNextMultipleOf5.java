package cata7;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(double number) {
        return (int) (Math.ceil(number / 5) * 5);
    }
}
