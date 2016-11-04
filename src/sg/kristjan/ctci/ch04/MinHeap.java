package sg.kristjan.ctci.ch04;


import sg.kristjan.ctci.ch03.Queue;

class MinHeap {
    public TreeNodeInt rightMost = null;
    private TreeNodeInt min = null;


    public void insert(int data) {
        TreeNodeInt n = new TreeNodeInt(data);
        // heap is empty
        if (min == null) {
            min = n;
            rightMost = n;
            return;
        }

        // heap is not empty
        // rightmost has always has never than 1 child
        assert (rightMost.right == null);
        try {
            rightMost.setChild(n);
        } catch (Exception e) {

        }
        // inserted node needs to bubble up
        while (n.parent != null && n.data < n.parent.data) {
            n.bubbleUp();
        }
        if (n.parent == null) {
            min = n;
        }
        setRightMost();
    }

    private void setRightMost() {
        // rightmost stays the same
        if (rightMost.left != null && rightMost.right == null) return;

        // do ab breath first search for closest leaf
        rightMost = findClosestLeaf(min);
    }

    private TreeNodeInt findClosestLeaf(TreeNodeInt n) {
        Queue<TreeNodeInt> queue = new Queue<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            if (n.left == null) break;
            queue.add(n.left);
            queue.add(n.right);
            n = queue.remove();
        }
        return n;


    }


    public String toString() {
        return this.min.toString();
    }
}