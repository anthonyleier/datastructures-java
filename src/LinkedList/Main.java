package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(12);
        linkedList.add(43);
        linkedList.add(67);
        linkedList.add(89);
        linkedList.add(23);
        System.out.println(linkedList);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
