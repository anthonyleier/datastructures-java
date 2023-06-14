package Queue;

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
    }
}
