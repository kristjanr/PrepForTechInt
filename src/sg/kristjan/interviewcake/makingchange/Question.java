package sg.kristjan.interviewcake.makingchange;


import java.util.ArrayList;

class Node {
    private ArrayList<Node> branches = new ArrayList<>();

    private int value;

    public Node(int v) {
        value = v;
    }


    void addBranch(Node branch) {
        branches.add(branch);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value).append(": [");
        for (Node n : branches) {
            sb.append(n).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    int countLeaves() {
        if (branches.size() == 0) return 1;
        int leaves = 0;
        for (Node n : branches) {
            leaves += n.countLeaves();
        }
        return leaves;
    }
}


public class Question {
    public static void main(String[] args) {
        int[] denom = new int[]{1, 2, 3};
        System.out.println(numberOfWays(4, denom));
    }

    public static int numberOfWays(int amount, int[] denominations) {
        if (denominations[0] > amount) return 0;
        Node root = buildTree(amount, amount, denominations, 0);
        return root.countLeaves();
    }


    private static Node buildTree(int sum, int value, int[] values, int rootToLeafVal) {
        Node node = new Node(value);
        for (int childVal : values) {
            if (rootToLeafVal + childVal > sum || childVal > value) {
                continue;
            }
            Node branch = buildTree(sum, childVal, values, rootToLeafVal + childVal);
            node.addBranch(branch);
        }
        return node;
    }
}