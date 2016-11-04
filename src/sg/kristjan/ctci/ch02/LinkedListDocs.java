package sg.kristjan.ctci.ch02;


public class LinkedListDocs<T> {
    private Node head;
    public LinkedListDocs() {
        head = null;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);
        }
    }

    public boolean remove(T data) {
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

    private class Node {
        private T data;
        Node next;

        Node(T data) {
            next = null;
            this.data = data;
        }
    }
}