package LinkedList;

public class Node {
    private final int value;
    private Node next;

    Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public Node getNext(){
        return next;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
