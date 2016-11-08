package sg.kristjan.ctci.ch08.ex8_1;

/**
 * Created by kristjan on 8/11/16.
 */


import java.util.ArrayList;


class Node {
    private ArrayList<Node> branches = new ArrayList<>();
    private int steps;

    public Node(int v) {
        steps = v;
    }


    void addBranch(Node branch) {
        branches.add(branch);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(steps).append(": [");
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
        int[] possibleStepsPerHop = new int[]{1, 2, 3};
        int stepsOnStaircase = 4;
        System.out.println(numberOfWays(stepsOnStaircase, possibleStepsPerHop));
    }


    public static int numberOfWays(int stepsOnStaircase, int[] possibleStepsPerHop) {
        if (possibleStepsPerHop[0] > stepsOnStaircase) return 0;
        Node root = buildTree(stepsOnStaircase, stepsOnStaircase, possibleStepsPerHop, 0);
        return root.countLeaves();
    }


    private static Node buildTree(int sum, int value, int[] values, int rootToLeafVal) {
        Node node = new Node(value);
        for (int childVal : values) {
            if (rootToLeafVal + childVal > sum) {
                continue;
            }
            Node branch = buildTree(sum, childVal, values, rootToLeafVal + childVal);
            node.addBranch(branch);
        }
        return node;
    }
}
