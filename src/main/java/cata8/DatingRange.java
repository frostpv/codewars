package cata8;

public class DatingRange {
    public static String datingRange(int age) {
        return age > 14
                ? (int) Math.floor((age/2) + 7) + "-" + (int) Math.floor((age - 7) * 2)
                : (int) Math.floor(age - age * 0.10) + "-" + (int) Math.floor(age + (age * 0.10));
    }
}
