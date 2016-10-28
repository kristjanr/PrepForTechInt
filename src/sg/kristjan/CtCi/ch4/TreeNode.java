package sg.kristjan.CtCi.ch4;


public class TreeNode {
    public String name;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode(String name, TreeNode left, TreeNode right) {
        this.name = name;
        this.left = left;
        this.right = right;
        if (this.left != null) this.left.parent = this;
        if (this.right != null) this.right.parent = this;
    }
}
