package sg.kristjan.CtCi.ch4.ex4_2;


import sg.kristjan.CtCi.ch4.TreeNodeInt;

class Question {
    public static TreeNodeInt binarySearchTree(int[] arr) {
        return binarySearchTree(arr, 0, arr.length - 1);
    }

    private static TreeNodeInt binarySearchTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNodeInt n = new TreeNodeInt(arr[mid]);
        n.setLeftChild(binarySearchTree(arr, start, mid - 1));
        n.setRightChild(binarySearchTree(arr, mid + 1, end));
        return n;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        TreeNodeInt x = binarySearchTree(arr);
        System.out.println(x);
    }
}