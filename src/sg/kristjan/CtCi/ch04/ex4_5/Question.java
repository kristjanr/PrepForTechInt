package sg.kristjan.CtCi.ch04.ex4_5;


import sg.kristjan.CtCi.ch04.TreeNodeInt;

import java.util.Objects;

class Question {
    public static boolean isBalancedSearchTree(TreeNodeInt root) {
        return !Objects.equals(isBST(root), NOT_BST);
    }


    private static final Integer NOT_BST = null;


    private static Integer isBST(TreeNodeInt node) {
        if (node.left != null) {
            Integer left_biggest = isBST(node.left);
            // same node values have to be on the left
            if (Objects.equals(left_biggest, NOT_BST) || node.data < left_biggest) return NOT_BST;
        }
        Integer right_biggest = null;
        if (node.right != null) {
            right_biggest = isBST(node.right);
            if (Objects.equals(right_biggest, NOT_BST) || node.data >= right_biggest) return NOT_BST;
        }
        if (right_biggest == null) return node.data;
        return right_biggest;
    }

    public static void main(String[] args) {
        TreeNodeInt d2 = new TreeNodeInt(2, null, null);
        TreeNodeInt d12 = new TreeNodeInt(12, null, null);
        TreeNodeInt d4 = new TreeNodeInt(4, d2, d12);
        TreeNodeInt d9 = new TreeNodeInt(9, null, null);
        TreeNodeInt d10 = new TreeNodeInt(4, d9, null);
        TreeNodeInt d8 = new TreeNodeInt(8, d4, d10);
        System.out.println(d8);
        System.out.println(isBalancedSearchTree(d8));
    }
}
