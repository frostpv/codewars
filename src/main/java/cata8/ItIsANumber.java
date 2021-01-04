//Given a string s, write a method (function)
// that will return true if its a valid single
// integer or floating number or false if its not.

// Valid examples, should return true:
package cata8;

public class ItIsANumber {
}

class MyUtilities {
    public boolean isDigit(String s) {
        return s.matches("^[-+]?[0-9]*[.,]?[E]?[0-9]+$");

    }

}
