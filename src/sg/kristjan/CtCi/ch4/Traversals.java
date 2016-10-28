package sg.kristjan.CtCi.ch4;


class Traversals {

    private static void visit(TreeNode node) {
        System.out.println(node.name);
    }

    public static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        visit(node);
        inOrder(node.right);
    }

    public static void preOrder(TreeNode node) {
        if (node == null) return;
        visit(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        visit(node);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode("A");
        TreeNode c = new TreeNode("C");
        TreeNode b = new TreeNode("B", a, c);
        TreeNode e = new TreeNode("E");
        TreeNode d = new TreeNode("D", b, e);

        TreeNode j = new TreeNode("J");
        TreeNode i = new TreeNode("I", null, j);
        TreeNode g = new TreeNode("G");
        TreeNode h = new TreeNode("H", g, i);

        TreeNode f = new TreeNode("F", d, h);

        inOrder(f);
        System.out.println();
        preOrder(f);
        System.out.println();
        postOrder(f);
    }
}
