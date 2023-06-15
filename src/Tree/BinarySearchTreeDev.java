package Tree;

public class BinarySearchTreeDev extends BinaryTreeDev {
    public void insert(int value) {
        Node parent = null;
        Node pivot = this.getRoot();

        while (pivot != null) {
            parent = pivot;
            if (value < pivot.getValue()) {
                pivot = pivot.getLeft();
            } else {
                pivot = pivot.getRight();
            }
        }

        if (parent == null) {
            this.setRoot(new Node(value));
        } else if (value < parent.getValue()) {
            parent.setLeft(new Node(value));
        } else {
            parent.setRight(new Node(value));
        }
    }

    private Node searchValue(int value, Node node) {
        if (node == null || node.getValue() == value) return node;
        if (value < node.getValue()) return this.searchValue(value, node.getLeft());
        if (value > node.getValue()) return this.searchValue(value, node.getRight());
        return null;
    }

    public BinarySearchTreeDev getValue(int value) {
        Node node = this.searchValue(value, this.getRoot());
        BinarySearchTreeDev result = new BinarySearchTreeDev();
        result.setRoot(node);
        return result;
    }

    public Node searchLowestValue(Node node) {
        if (node.getLeft() != null) return this.searchLowestValue(node.getLeft());
        else return node;
    }

    public BinarySearchTreeDev getLowestValue() {
        Node node = this.searchLowestValue(this.getRoot());
        BinarySearchTreeDev result = new BinarySearchTreeDev();
        result.setRoot(node);
        return result;
    }

    public Node searchHighestValue(Node node) {
        if (node.getRight() != null) return this.searchHighestValue(node.getRight());
        else return node;
    }

    public BinarySearchTreeDev getHighestValue() {
        Node node = this.searchHighestValue(this.getRoot());
        BinarySearchTreeDev result = new BinarySearchTreeDev();
        result.setRoot(node);
        return result;
    }

    public Node removeValue(int value, Node node) {
        if (node == null) return null;

        if (value < node.getValue()) node.setLeft(this.removeValue(value, node.getLeft()));
        else if (value > node.getValue()) node.setRight(this.removeValue(value, node.getRight()));

        else {
            if (node.getLeft() == null && node.getRight() == null) return null;
            if (node.getLeft() == null) return node.getRight();
            if (node.getRight() == null) return node.getLeft();
            else {
                int substituteValue = this.searchLowestValue(node.getRight()).getValue();
                node.setValue(substituteValue);
                node.setRight(this.removeValue(substituteValue, node.getRight()));
            }
        }

        return node;
    }

    public BinarySearchTreeDev remove(int value) {
        this.removeValue(value, this.getRoot());
        return null;
    }
}
