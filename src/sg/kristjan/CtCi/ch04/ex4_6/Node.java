package sg.kristjan.CtCi.ch04.ex4_6;


class Node {
    public Node parent;
    public Node left;
    public Node right;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public Node(Node left, int value, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node next() {
        return next(this);
    }

    private Node next(Node caller) {

        // the next one in in-order traversal is the leftmost child of the child on the right
        if (right != null && right != caller) {
            return right.leftmost();
        } else {

            // ... or ab parent, if there is no right child and this node is the left child of the parent
            if (parent != null) {

                // ... or ab parent, if there is no right child and this node is the left child of the parent
                if (parent.left == this) return parent;

                return parent.next(this);
            }
        }
        return null;
    }

    private Node leftmost() {
        if (this.left == null) return this;
        return left.leftmost();
    }

    public String toString() {
        if (left != null & right != null) return value + ": (" + left + ", " + right + ")";
        if (left != null) return value + ": (" + left + ",)";
        if (right != null) return value + ": (," + right + ")";
        return "" + value;
    }
}
