package LinkedList;

public class LinkedList {
    private final Node head;
    private Node last;
    private int size;

    LinkedList(int value) {
        this.head = new Node(value);
        this.last = this.head;
        this.size = 0;
    }

    public void add(int value) {
        Node node = new Node(value);
        this.last.setNext(node);
        this.last = node;
        this.size++;
    }

    public int getIndex(int index) {
        if (index < 0 || index > this.size) throw new IndexOutOfBoundsException("Index fora de alcance");

        Node currentNode = this.head;
        int counter = 0;

        while (counter != index) {
            currentNode = currentNode.getNext();
            counter++;
        }

        return currentNode.getValue();
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        Node currentNode = this.head;
        while (currentNode != null) {
            message.append(currentNode);
            message.append(", ");
            currentNode = currentNode.getNext();
        }
        return message.toString();
    }
}
