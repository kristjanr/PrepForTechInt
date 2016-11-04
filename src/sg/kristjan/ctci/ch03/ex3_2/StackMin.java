package sg.kristjan.ctci.ch03.ex3_2;


import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackMin {
    private class Node {
        int data;
        int min;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public int pop() throws NoSuchElementException {
        if (top == null) throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        return data;
    }

    public void push(int data) {
        Node n = new Node(data);
        if (top == null || top.data >= n.data) {
            n.min = n.data;
        } else {
            n.min = top.min;
        }
        n.next = top;
        top = n;
    }

    public int peek() throws EmptyStackException {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public int min() throws EmptyStackException {
        if (top == null) throw new EmptyStackException();
        return top.min;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
