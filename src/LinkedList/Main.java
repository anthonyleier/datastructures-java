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

        System.out.println("Item do índice 0: " + linkedList.get(0));
        System.out.println("Item do índice 1: " + linkedList.get(1));
        System.out.println(linkedList);

        System.out.println("Primeiro elemento: " + linkedList.getFirst());
        System.out.println("Primeiro elemento removido: " + linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println("Último elemento: " + linkedList.getLast());
        System.out.println("Último elemento removido: " + linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println("Último elemento: " + linkedList.getLast());
        System.out.println("Último elemento removido: " + linkedList.removeLast());
        System.out.println(linkedList);
    }
}
