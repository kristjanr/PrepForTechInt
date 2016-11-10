package sg.kristjan.google.workshop;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question1 {
    private enum Traversal {IN_ORDER, PRE_ORDER, POST_ORDER}

    public static void main(String[] args) {
        Node four = new Node(4);
        Node two = new Node(2);
        Node five = new Node(5);
        two.left = four;
        two.right = five;

        Node six = new Node(6);
        Node three = new Node(3);
        Node seven = new Node(7);
        three.left = six;
        three.right = seven;

        Node one = new Node(1);
        one.left = two;
        one.right = three;

        System.out.println(binaryTreeToStack(one, Traversal.IN_ORDER));
        System.out.println(binaryTreeToStack(one, Traversal.PRE_ORDER));
        System.out.println(binaryTreeToStack(one, Traversal.POST_ORDER));
        System.out.println(binaryTreeToStack(six, Traversal.POST_ORDER));
        System.out.println(binaryTreeToStack(null, Traversal.POST_ORDER));
    }

    private static Deque<Integer> binaryTreeToStack(Node root, Traversal t) {
        Deque<Integer> result = new ArrayDeque<>();
        switch (t) {
            case IN_ORDER:
                traverseInOrder(root, result);
                break;
            case PRE_ORDER:
                traversePreOrder(root, result);
                break;
            case POST_ORDER:
                traversePostOrder(root, result);
                break;
        }
        return result;
    }

    private static void traverseInOrder(Node node, Deque<Integer> result) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.left, result);
        result.add(node.value);
        traverseInOrder(node.right, result);
    }

    private static void traversePreOrder(Node node, Deque<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.value);
        traversePreOrder(node.left, result);
        traversePreOrder(node.right, result);
    }

    private static void traversePostOrder(Node node, Deque<Integer> result) {
        if (node == null) {
            return;
        }
        traversePostOrder(node.left, result);
        traversePostOrder(node.right, result);
        result.add(node.value);
    }
}


class Node {
    public Node left = null;
    public Node right = null;
    public int value;

    public Node(int value) {
        this.value = value;
    }
}
