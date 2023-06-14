package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(15);
        stack.add(30);
        stack.add(45);
        stack.add(60);
        stack.add(95);

        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack);
    }
}
