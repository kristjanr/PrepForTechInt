package sg.kristjan.ctci.ch02;


class DoublyLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        Node previous;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }

        public String toString() {
            return "" + data;
        }
    }

    public void add(int data) {
        Node n = new Node(data);
        // list is empty
        if (head == null) {
            head = n;
            tail = n;
        } else {
            Node currentLast = tail;
            currentLast.next = n;
            n.previous = currentLast;
            tail = n;
        }
    }

    public boolean remove(int data) {
        if (head.data == data) {
            head = head.next;
            head.previous = null;
            return true;
        }
        if (tail.data == data) {
            tail = tail.previous;
            tail.next = null;
            return true;
        }
        Node n = head;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                n.next.previous = n;
                return true;
            }
        }
        return false;
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

    public String toStringReverse() {
        String txt = "[";
        Node n = tail;
        txt += n + ", ";
        while (n.previous != null) {
            n = n.previous;
            txt += n + ", ";
        }
        txt += "]";
        return txt;
    }
}
