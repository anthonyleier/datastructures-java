package Tree;

public class Main {
    public static void binaryTreeTest() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n6.setLeft(n7);
        n6.setRight(n8);
        n5.setLeft(n6);
        n5.setRight(n9);
        n3.setLeft(n4);
        n3.setRight(n5);
        n2.setLeft(n1);
        n2.setRight(n3);

        BinaryTreeDev binaryTreeDev = new BinaryTreeDev();
        binaryTreeDev.setRoot(n2);

        binaryTreeDev.printInOrderTraversal();
        binaryTreeDev.printPostOrderTraversal();
        binaryTreeDev.printLevelOrderTraversal();

        System.out.println("Altura: " + binaryTreeDev.getHeight());
    }

    public static void binarySearchTreeTest() {
        BinarySearchTreeDev binarySearchTreeDev = new BinarySearchTreeDev();
        binarySearchTreeDev.insert(61);
        binarySearchTreeDev.insert(89);
        binarySearchTreeDev.insert(100);
        binarySearchTreeDev.insert(90);
        binarySearchTreeDev.insert(66);
        binarySearchTreeDev.insert(43);
        binarySearchTreeDev.insert(51);
        binarySearchTreeDev.insert(16);
        binarySearchTreeDev.insert(55);
        binarySearchTreeDev.insert(11);
        binarySearchTreeDev.insert(79);
        binarySearchTreeDev.insert(77);
        binarySearchTreeDev.insert(82);
        binarySearchTreeDev.insert(32);

        binarySearchTreeDev.printInOrderTraversal();
        binarySearchTreeDev.printPostOrderTraversal();
        binarySearchTreeDev.printLevelOrderTraversal();

        System.out.println("Altura: " + binarySearchTreeDev.getHeight());
        System.out.println("Resultado da busca: " + binarySearchTreeDev.getValue(30).getRoot());
        System.out.println("Resultado da busca: " + binarySearchTreeDev.getValue(55).getRoot().getValue());
        System.out.println("Menor valor: " + binarySearchTreeDev.getLowestValue().getRoot().getValue());
        System.out.println("Maior valor: " + binarySearchTreeDev.getHighestValue().getRoot().getValue());

        binarySearchTreeDev.printInOrderTraversal();
        binarySearchTreeDev.remove(55);
        binarySearchTreeDev.remove(90);
        binarySearchTreeDev.remove(66);
        binarySearchTreeDev.printInOrderTraversal();
    }


    public static void main(String[] args) {
        binaryTreeTest();
        binarySearchTreeTest();
    }
}
