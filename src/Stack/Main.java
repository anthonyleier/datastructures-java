package Stack;

public class Main {
    public static void main(String[] args) {
        // Minha implementação de Pilha (Stack)
        StackDev stackDev = new StackDev();
        stackDev.add(30);
        stackDev.add(45);
        stackDev.add(60);
        stackDev.add(95);

        System.out.println(stackDev);
        System.out.println("Elemento removido: " + stackDev.remove());
        System.out.println("Elemento removido: " + stackDev.remove());
        System.out.println(stackDev);

        System.out.println("Item do topo: " + stackDev.peek());
        System.out.println("Tamanho da pilha: " + stackDev.size());
    }
}
