package sg.kristjan.CtCi.ch4.ex4_4;


import sg.kristjan.CtCi.ch4.TreeNodeInt;


class Question {
    public static boolean isBalancedTree(TreeNodeInt root) {
        return isBalanced(root) != NOT_BALANCED;
    }

    private static final int NOT_BALANCED = -1;


    private static int isBalanced(TreeNodeInt node) {
        if (node == null) return 0;


        int leftHeight = isBalanced(node.left);
        if (leftHeight == NOT_BALANCED) return NOT_BALANCED;


        int rightHeight = isBalanced(node.right);
        if (rightHeight == NOT_BALANCED) return NOT_BALANCED;


        if (Math.abs(leftHeight - rightHeight) > 1) return NOT_BALANCED;


        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) {
        TreeNodeInt d4 = new TreeNodeInt(4);
        TreeNodeInt d3 = new TreeNodeInt(3);
        TreeNodeInt d2 = new TreeNodeInt(2, d3, null);
        TreeNodeInt d1 = new TreeNodeInt(1, d2, null);
        TreeNodeInt d0 = new TreeNodeInt(0, d1, d4);
        System.out.println(isBalancedTree(d0));
    }
}