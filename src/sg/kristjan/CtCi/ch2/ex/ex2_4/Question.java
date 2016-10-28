package sg.kristjan.CtCi.ch2.ex.ex2_4;


import sg.kristjan.CtCi.ch2.SinglyLinkedList;
import sg.kristjan.CtCi.ch2.ex.Node;


public class Question {
    public static SinglyLinkedList partitioned(SinglyLinkedList list, int x) {
        if (list.first() == null) return null;
        if (list.first().next == null) return list;
        Node n = list.first();
        SinglyLinkedList small = new SinglyLinkedList();
        SinglyLinkedList big = new SinglyLinkedList();
        while (n.next != null) {
            if (n.data < x) {
                small.add(n);
            } else {
                big.add(n);
            }
            n = n.next;
        }
        small.add(big.first());
        return small;
    }
}

