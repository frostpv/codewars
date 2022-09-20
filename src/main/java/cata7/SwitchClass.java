package cata7;

public class SwitchClass {
    public static String switcheroo(String x) {
       return x.replaceAll("a", "x")
               .replaceAll("b", "a")
               .replaceAll("x","b");
    }
}
