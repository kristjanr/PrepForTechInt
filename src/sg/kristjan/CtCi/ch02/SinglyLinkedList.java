package sg.kristjan.CtCi.ch02;

import sg.kristjan.CtCi.ch02.ex.Node;

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node n = new Node(data);
        addNode(n);
    }

    public void add(Node n) {
        addNode(n);
    }

    private void addNode(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }


    public boolean remove(int data) {
        if (head == null) return false;
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node n = head;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public Node first() {
        return head;
    }

    public Node last() {
        return tail;
    }

    public String toString() {
        String txt = "[";
        Node n = head;
        txt += n + ", ";
        while (n.next != null) {
            n = n.next;
            txt += n + ", ";
        }
        txt += "]";
        return txt;
    }

}