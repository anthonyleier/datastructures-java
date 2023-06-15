package Tree;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node("a");
        Node n2 = new Node("+");
        Node n3 = new Node("*");
        Node n4 = new Node("b");
        Node n5 = new Node("-");
        Node n6 = new Node("/");
        Node n7 = new Node("c");
        Node n8 = new Node("d");
        Node n9 = new Node("e");

        n6.setLeft(n7);
        n6.setRight(n8);
        n5.setLeft(n6);
        n5.setRight(n9);
        n3.setLeft(n4);
        n3.setRight(n5);
        n2.setLeft(n1);
        n2.setRight(n3);

        BinaryTreeDev inOrderTree = new BinaryTreeDev(n2);
        inOrderTree.printInOrderTraversal();
        System.out.println("Altura: " + inOrderTree.getHeight());

        Node n10 = new Node("I");
        Node n11 = new Node("N");
        Node n12 = new Node("S");
        Node n13 = new Node("C");
        Node n14 = new Node("R");
        Node n15 = new Node("E");
        Node n16 = new Node("V");
        Node n17 = new Node("A");
        Node n18 = new Node("-");
        Node n19 = new Node("S");
        Node n20 = new Node("E");

        n20.setLeft(n15);
        n20.setRight(n19);

        n15.setLeft(n10);
        n15.setRight(n14);

        n14.setLeft(n11);
        n14.setRight(n13);

        n13.setRight(n12);
        n19.setLeft(n17);
        n17.setRight(n16);
        n19.setRight(n18);

        BinaryTreeDev postOrderTree = new BinaryTreeDev(n20);
        postOrderTree.printPostOrderTraversal();
        System.out.println("Altura: " + postOrderTree.getHeight());

        inOrderTree.printLevelOrderTraversal();
        postOrderTree.printLevelOrderTraversal();
    }
}
