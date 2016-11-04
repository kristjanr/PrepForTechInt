package sg.kristjan.ctci.ch03.ex3_3;


import sg.kristjan.ctci.ch03.Stack;

import java.util.EmptyStackException;

class StackOfPlatesA {
    private Stack stacks = new Stack();
    private Stack top = new Stack();
    private final int maxHeight = 2;

    public void push(int data) {
        if (top.getHeight() == maxHeight) {
            stacks.push(top);
            top = new Stack();
        }
        top.push(data);
    }

    public Object pop() throws EmptyStackException {
        if (top == null) throw new EmptyStackException();
        Object data = top.pop();
        if (top.getHeight() == 0) {
            try {
                top = (Stack) stacks.pop();
            } catch (EmptyStackException ex) {
                top = null;
            }
        }
        return data;
    }
}
