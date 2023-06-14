package LinkedList;

import java.util.LinkedList;

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

        // Nativo (java.util.LinkedList)
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Primeiro");
        linkedList.add("Segundo");
        linkedList.add("Terceiro");

        linkedList.addFirst("Zero");
        linkedList.add(2, "Dois");

        System.out.println("Tamanho da lista: " + linkedList.size());
        System.out.println("A lista está vazia? " + linkedList.isEmpty());
        System.out.println("Elemento na posição 1: " + linkedList.get(1));
        System.out.println("Elemento removido: " + linkedList.remove(3));
        System.out.println("A lista contém Terceiro? " + linkedList.contains("Terceiro"));
        System.out.println(linkedList);
    }
}
