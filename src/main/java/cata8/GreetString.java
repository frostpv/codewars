package cata8;

public class GreetString {
    private final static String GREET = "Hello, <name> how are you doing today?";

    public static String greet(String name) {
        return GREET.replace("<name>", name);
    }
}
