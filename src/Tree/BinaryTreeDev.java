package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDev {
    private Node root;

    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    private void inOrderTraversal(Node node) {
        if (node.getLeft() != null) inOrderTraversal(node.getLeft());
        System.out.print(node.getValue() + ",");
        if (node.getRight() != null) inOrderTraversal(node.getRight());
    }

    public void printInOrderTraversal() {
        this.inOrderTraversal(this.root);
        System.out.println();
    }

    private void postOrderTraversal(Node node) {
        if (node.getLeft() != null) postOrderTraversal(node.getLeft());
        if (node.getRight() != null) postOrderTraversal(node.getRight());
        System.out.print(node.getValue() + ",");
    }

    public void printPostOrderTraversal() {
        this.postOrderTraversal(this.root);
        System.out.println();
    }

    private void levelOrderTraversal(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            node = queue.remove();

            if (node != null){
                if (node.getLeft() != null)queue.add(node.getLeft());
                if (node.getRight() != null)queue.add(node.getRight());
                System.out.print(node.getValue() + ",");
            }
        }
    }

    public void printLevelOrderTraversal(){
        this.levelOrderTraversal(this.root);
        System.out.println();
    }

    public int calculateHeight(Node node) {
        int heightLeft = 0;
        int heightRight = 0;

        if (node.getLeft() != null) heightLeft = this.calculateHeight(node.getLeft());
        if (node.getRight() != null) heightRight = this.calculateHeight(node.getRight());

        if (heightLeft > heightRight) {
            return heightLeft + 1;
        } else {
            return heightRight + 1;
        }
    }

    public int getHeight() {
        return this.calculateHeight(this.root);
    }
}
