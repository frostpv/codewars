package cata7;

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case ("add"):
                return add(a, b);

            case ("subtract"):
                return subtract(a, b);

            case ("multiply"):
                return multiply(a, b);

            case ("divide"):
                return divide(a, b);

            default:
                return 0;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
