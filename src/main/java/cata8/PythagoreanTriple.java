package cata8;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        int a = triple[0];
        int b = triple[1];
        int c = triple[2];

        return c*c == ((a*a)+ (b*b)) ? 1 : 0;
    }
}
