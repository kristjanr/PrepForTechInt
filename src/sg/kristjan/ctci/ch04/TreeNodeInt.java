package sg.kristjan.ctci.ch04;


public class TreeNodeInt {
    public int data;
    public TreeNodeInt left;
    public TreeNodeInt right;
    public TreeNodeInt parent;
    public int depth;
    public boolean marked = false;

    public TreeNodeInt(int data) {
        this.data = data;
    }


    public void setLeftChild(TreeNodeInt left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    public void setRightChild(TreeNodeInt right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public void setChild(TreeNodeInt child) throws Exception {
        if (left != null && right != null) throw new Exception();
        if (left != null) {
            right = child;
        } else {
            left = child;
        }
        child.parent = this;
    }

    public void bubbleUp() {
        if (parent == null) return;
        TreeNodeInt currentParent = this.parent;
        // switch parents of nodes
        TreeNodeInt parent = currentParent.parent;
        currentParent.parent = this;
        this.parent = parent;


        // handle parents children
        if (this.parent != null) {
            if (this.parent.right == currentParent) {
                this.parent.right = this;
            } else {
                this.parent.left = this;
            }
        }


        // switch children of nodes
        TreeNodeInt left = currentParent.left;
        TreeNodeInt right = currentParent.right;
        currentParent.left = this.left;
        currentParent.right = this.right;


        if (left == this) {
            this.left = currentParent;
            this.right = right;
        } else {
            this.left = left;
            this.right = currentParent;
        }
    }

    public String toString() {
        if (left != null & right != null) return data + ": (" + left + ", " + right + ")";
        if (left != null) return data + ": (" + left + ",)";
        if (right != null) return data + ": (," + right + ")";
        return "" + data;
    }

    public TreeNodeInt(int data, TreeNodeInt left, TreeNodeInt right) {
        this.data = data;
        this.left = left;
        this.right = right;
        if (this.left != null) this.left.parent = this;
        if (this.right != null) this.right.parent = this;
    }
}
