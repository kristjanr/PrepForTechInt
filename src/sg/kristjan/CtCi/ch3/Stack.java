package sg.kristjan.CtCi.ch3;


import java.util.EmptyStackException;

public class Stack<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private int height = 0;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T data = top.data;
        top = top.next;
        height -= 1;
        return data;
    }

    public void push(T data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        height += 1;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public int getHeight() {
        return height;
    }

    public boolean isEmpty() {
        return top == null;
    }
}