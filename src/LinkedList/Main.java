package LinkedList;

public class Main {
    public static void main(String[] args) {
        // Minha implementação de LinkedList
        LinkedListDev linkedListDev = new LinkedListDev();
        linkedListDev.add(12);
        linkedListDev.add(43);
        linkedListDev.add(67);
        linkedListDev.add(89);
        linkedListDev.add(23);
        System.out.println(linkedListDev);

        System.out.println("Item do índice 0: " + linkedListDev.get(0));
        System.out.println("Item do índice 1: " + linkedListDev.get(1));
        System.out.println(linkedListDev);

        System.out.println("Primeiro elemento: " + linkedListDev.getFirst());
        System.out.println("Primeiro elemento removido: " + linkedListDev.removeFirst());
        System.out.println(linkedListDev);

        System.out.println("Último elemento: " + linkedListDev.getLast());
        System.out.println("Último elemento removido: " + linkedListDev.removeLast());
        System.out.println(linkedListDev);

        System.out.println("Último elemento: " + linkedListDev.getLast());
        System.out.println("Último elemento removido: " + linkedListDev.removeLast());
        System.out.println(linkedListDev);
    }
}
