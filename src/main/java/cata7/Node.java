package cata7;

public class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception{
        return  index == 0
                ? n.data
                : getNth(n.next, --index);
    }
}
