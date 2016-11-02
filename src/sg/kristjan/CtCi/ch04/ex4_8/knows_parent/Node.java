package sg.kristjan.CtCi.ch04.ex4_8.knows_parent;

class Node {
    private String name;
    private Node parent;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void setLeft(Node n) {
        left = n;
        left.parent = this;
    }

    public void setRight(Node n) {
        right = n;
        right.parent = this;
    }

    public String toString() {
        if (left != null & right != null) return name + ": (" + left + ", " + right + ")";
        if (left != null) return name + ": (" + left + ",)";
        if (right != null) return name + ": (," + right + ")";
        return "" + name;
    }


    public Node getParent() {
        return parent;
    }
}