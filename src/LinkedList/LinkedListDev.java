package LinkedList;

public class LinkedListDev {
    private Node head;
    private Node last;
    private int size;

    LinkedListDev() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.last = this.head;
        } else {
            this.last.next = node;
            this.last = node;
        }
        this.size++;
    }

    public int get(int index) {
        if (index < 0 || index > this.size - 1) throw new IndexOutOfBoundsException("Index fora de alcance");

        Node currentNode = this.head;
        int counter = 0;

        while (counter != index && currentNode != null) {
            currentNode = currentNode.next;
            counter++;
        }

        assert currentNode != null;
        return currentNode.value;
    }

    public int getFirst() {
        return this.head.value;
    }

    public int getLast() {
        return this.last.value;
    }

    public int removeFirst() {
        Node first = this.head;
        this.head = first.next;
        return first.value;
    }

    public int removeLast() {
        Node currentNode = this.head;
        Node last = this.last;
        while (currentNode.next != this.last) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.last = currentNode;
        return last.value;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        Node currentNode = this.head;

        while (currentNode != null) {
            message.append(currentNode);
            message.append(", ");
            currentNode = currentNode.next;
        }

        return message.toString();
    }

    public static class Node {
        private final int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return Integer.toString(this.value);
        }
    }
}
