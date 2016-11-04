package sg.kristjan.ctci.ch03;


import java.util.NoSuchElementException;

public class Queue<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void add(T data) {
        Node n = new Node(data);
        if (last != null) {
            last.next = n;
        }
        last = n;
        if (first == null) first = last;
    }

    public T remove() throws NoSuchElementException {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) last = null;
        return data;
    }

    public T peek() throws NoSuchElementException {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }


    public boolean isEmpty() {
        return first == null;
    }
}