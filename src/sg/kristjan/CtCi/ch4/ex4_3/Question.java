package sg.kristjan.CtCi.ch4.ex4_3;


import sg.kristjan.CtCi.ch3.Queue;
import sg.kristjan.CtCi.ch4.TreeNodeInt;

class Question {

    public static LinkedLists listOfDepths(TreeNodeInt node) {
        LinkedLists lists = new LinkedLists();
        dfs(node, 0, lists);
        return lists;
    }

    private static void dfs(TreeNodeInt node, int depth, LinkedLists lists) {
        if (node == null) return;
        lists.insertToList(node, depth);
        dfs(node.left, depth + 1, lists);
		dfs(node.right, depth + 1, lists);
    }


    public static LinkedLists listOfDepthsBfs(TreeNodeInt node) {
        LinkedLists lists = new LinkedLists();
        bfs(node, lists);
        return lists;
    }


    private static void bfs(TreeNodeInt node, LinkedLists lists) {

        Queue<TreeNodeInt> queue = new Queue<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.parent == null) {
                node.depth = 0;
            } else {
                node.depth = node.parent.depth + 1;
            }
            lists.insertToList(node, node.depth);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }
    public static void main(String[] args) {
        TreeNodeInt d3 = new TreeNodeInt(3);
        TreeNodeInt d2 = new TreeNodeInt(2);
        TreeNodeInt d1 = new TreeNodeInt(1, d3, null);
        TreeNodeInt d0 = new TreeNodeInt(0, d1, d2);
        System.out.println(listOfDepths(d0) + "");
        System.out.println(listOfDepthsBfs(d0) + "");
    }
}
