package LinkedList;

public class Main {
    public static void main(String[] args) {
        // Lógica de Nodes
        Node one = new Node(12);
        Node two = new Node(24);
        Node three = new Node(36);
        Node four = new Node(48);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);

        Node head = one;
        while (head != null) {
            System.out.println(head);
            head = head.getNext();
        }

        // Utilização da classe criada LinkedList
        LinkedList list = new LinkedList(34);
        list.add(43);
        list.add(67);
        list.add(89);
        list.add(23);
        System.out.println(list);
        System.out.println(list.getIndex(0));
        System.out.println(list.getIndex(1));
        System.out.println(list.getIndex(2));
        System.out.println(list.getIndex(3));
        System.out.println(list.getIndex(4));
        System.out.println(list.getIndex(5));
    }
}
