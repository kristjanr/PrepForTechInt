package sg.kristjan.CtCi.ch04.ex4_8.knows_parent;


class Question {
    public static Node commonAncestor(Node a, Node b) {
        if (a == null || b == null) return null;
        if (a == b) return a.getParent();
        while (true) {
            if (a.getParent() != null) a = a.getParent();
            Node ancestor = commonAncestor(b, a);
            if (ancestor != null) return ancestor;
            if (a == null && b == null) return null;
            if (a == b) return a;
        }
    }


    public static void main(String[] args) {
        Node common = new Node("common ancestor");
        Node leftParent = new Node("parent to left");
        Node left = new Node("left");
        Node right = new Node("right");
        leftParent.setLeft(left);
        common.setLeft(leftParent);
        common.setRight(right);
        System.out.println(commonAncestor(left, right));
    }
}