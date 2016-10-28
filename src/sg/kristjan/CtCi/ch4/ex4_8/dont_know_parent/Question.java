package sg.kristjan.CtCi.ch4.ex4_8.dont_know_parent;


class Question {
    public static Node commonAncestor(Node root, Node a, Node b) {

        while (true) {
            if (a.isDescendant(root.getLeft()) && b.isDescendant(root.getLeft())) {
                root = root.getLeft();
            } else if (a.isDescendant(root.getRight()) && b.isDescendant(root.getRight())) {
                root = root.getRight();
            } else if (a.isDescendant(root) && b.isDescendant(root)) {
                return root;
            } else {
                return null;
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node("root");
        Node common = new Node("common ancestor");
        Node leftParent = new Node("parent to left");
        Node left = new Node("left");
        Node right = new Node("right");
        root.setRight(common);
        leftParent.setLeft(left);
        common.setLeft(leftParent);
        common.setRight(right);
        System.out.println(commonAncestor(root, left, right));
    }
}