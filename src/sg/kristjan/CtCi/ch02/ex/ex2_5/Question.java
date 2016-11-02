package sg.kristjan.CtCi.ch02.ex.ex2_5;


import sg.kristjan.CtCi.Lib.LinkedListNode;

public class Question {
    public static LinkedListNode sumLists(LinkedListNode a, LinkedListNode b) {
        a = a.last;
        b = b.last;
        int sum = a.data + b.data;
        LinkedListNode answer;
        if (sum > 9) {
            LinkedListNode next = new LinkedListNode(sum / 10);
            answer = new LinkedListNode(sum % 10);
            answer.setNext(next);
        } else {
            answer = new LinkedListNode(sum);
        }
        while (true) {
            if (a != null) a = a.prev;
            if (b != null) b = b.prev;
            if (a == null && b == null) break;
            int a_data = 0;
            int b_data = 0;
            if (a != null) a_data = a.data;
            if (b != null) b_data = b.data;
            sum = a_data + b_data;
            if (sum > 9) {
                answer.data += sum / 10;
                sum %= 10;
            }
            LinkedListNode n = new LinkedListNode(sum);
            answer.setPrevious(n);
            answer = n;

        }
        return answer;
    }

    private static LinkedListNode[] buildSameLength(LinkedListNode a, LinkedListNode b) {
        a = a.last;
        b = b.last;
        while (a.prev != null || b.prev != null) {
            if (a.prev == null) a.setPrevious(new LinkedListNode(0, a, null));
            if (b.prev == null) b.setPrevious(new LinkedListNode(0, b, null));
            a = a.prev;
            b = b.prev;

        }
        return new LinkedListNode[]{a, b};
    }

    public static LinkedListNode sumListsForward(LinkedListNode a, LinkedListNode b) {
        LinkedListNode[] nodes = buildSameLength(a, b);
        a = nodes[0];
        b = nodes[1];

        int sum = a.data + b.data;
        LinkedListNode answer;
        if (sum > 9) {
            LinkedListNode previous = new LinkedListNode(sum / 10);
            answer = new LinkedListNode(sum % 10);
            answer.setPrevious(previous);
        } else {
            answer = new LinkedListNode(sum);
        }
        while (true) {
            if (a != null) a = a.next;
            if (b != null) b = b.next;
            if (a == null && b == null) break;

            int a_data = 0;
            int b_data = 0;
            if (a != null) a_data = a.data;
            if (b != null) b_data = b.data;
            sum = a_data + b_data;
            if (sum > 9) {
                answer.data += sum / 10;
                sum %= 10;
            }
            LinkedListNode n = new LinkedListNode(sum);
            answer.setNext(n);
            answer = n;
        }
        while (answer.prev != null) {
            answer = answer.prev;
        }

        return answer;
    }

    public static void main(String[] args) {
        testSecond();


    }

    private static void testFirst() {
        LinkedListNode a__0 = new LinkedListNode(0);
        LinkedListNode a_0 = new LinkedListNode(0);
        LinkedListNode a1 = new LinkedListNode(1);
        a__0.setNext(a_0);
        a_0.setNext(a1);
        a__0.last = a1;

        LinkedListNode b1 = new LinkedListNode(1);
        b1.last = b1;

        LinkedListNode answer = sumLists(a__0, b1);
        System.out.println(answer.printForward());
    }

    private static void testSecond() {
        LinkedListNode a1 = new LinkedListNode(1);
        LinkedListNode a0 = new LinkedListNode(0);
        LinkedListNode a2 = new LinkedListNode(2);
        a1.setNext(a0);
        a0.setNext(a2);
        a1.last = a2;

        LinkedListNode b1 = new LinkedListNode(1);
        b1.last = b1;

        LinkedListNode answer = sumListsForward(a1, b1);
        System.out.println(answer.printForward());
    }
}
