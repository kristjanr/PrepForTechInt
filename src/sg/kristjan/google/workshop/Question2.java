package sg.kristjan.google.workshop;


import java.util.Arrays;

/**
 * Created by kristjan on 10/11/16.
 */

class Node2 {
    Node2 next = null;
    int val;

    public Node2(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val).append(", ");
        Node2 n = next;
        while (n != null) {
            sb.append(n.val).append(", ");
            n = n.next;
        }
        return sb.toString();
    }
}

public class Question2 {
    public static void main(String[] args) {
        Node2 zero = new Node2(0);
        Node2 one = new Node2(1);
        Node2 two = new Node2(2);
        Node2 three = new Node2(3);
        Node2 four = new Node2(4);
        Node2 five = new Node2(5);
        four.next = five;
        three.next = four;
        two.next = three;
        one.next = two;
        zero.next = one;

        System.out.println(Arrays.toString(solution(zero)));
    }

    private static Node2[] solution(Node2 first) {
        // remove nodes over one and
        // return the first node
        Node2 even = first;
        Node2 oddFirst = null;
        if (first != null) {
            oddFirst = first.next;
        }
        Node2 odd = oddFirst;
        while (true) {
            if (even != null && even.next != null) {
                even.next = even.next.next;
            }
            if (even != null) {
                even = even.next;
            }
            if (odd != null && odd.next != null) {
                odd.next = odd.next.next;
            }
            if (odd != null) {
                odd = odd.next;
            }
            if (even == null && odd == null) {
                break;
            }
        }

        return new Node2[]{first, reverse(oddFirst)};
    }

    private static Node2 reverse(Node2 node) {
        Node2 previous = null;
        while (node.next != null) {
            Node2 next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        node.next = previous;
        return node;
    }
}