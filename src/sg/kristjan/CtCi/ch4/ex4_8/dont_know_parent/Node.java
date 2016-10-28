package sg.kristjan.CtCi.ch4.ex4_8.dont_know_parent;

class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public void setRight(Node n) {
        right = n;
    }

    public String toString() {
        if (left != null & right != null) return name + ": (" + left + ", " + right + ")";
        if (left != null) return name + ": (" + left + ",)";
        if (right != null) return name + ": (," + right + ")";
        return "" + name;
    }


    public boolean isDescendant(Node n) {
        if (n == null) return false;
        if (n == this) {
            return true;
        }
        if (isDescendant(n.left)) {
            return true;
        } else if (isDescendant(n.right)) {
            return true;
        }
        return false;

    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}