package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(15);
        queue.add(30);
        queue.add(45);
        queue.add(60);
        queue.add(95);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
