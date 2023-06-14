package LinkedList;

public class LinkedList {
    private Node head;
    private Node last;
    private int size;

    LinkedList() {
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
