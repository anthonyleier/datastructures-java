package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Minha implementação de Fila (Queue)
        QueueDev queueDev = new QueueDev();
        queueDev.add(30);
        queueDev.add(45);
        queueDev.add(60);
        queueDev.add(95);

        System.out.println(queueDev);
        System.out.println("Elemento removido: " + queueDev.remove());
        System.out.println("Elemento removido: " + queueDev.remove());
        System.out.println(queueDev);

        System.out.println("Próximo da fila: " + queueDev.peek());
        System.out.println("Tamanho da fila: " + queueDev.size());

        // Nativo (java.util.Queue) // Por ser interface, utilizamos através do LinkedList
        Queue<String> queue = new LinkedList<>();

        queue.add("Primeiro");
        queue.add("Segundo");
        queue.add("Terceiro");

        System.out.println("Item do topo: " + queue.peek());
        System.out.println("Elemento removido: " + queue.poll());
        System.out.println("Item do topo: " + queue.peek());
        System.out.println("Tamanho da fila: " + queue.size());
        System.out.println("A fila está vazia? " + queue.isEmpty());
        System.out.println(queue);
    }
}
