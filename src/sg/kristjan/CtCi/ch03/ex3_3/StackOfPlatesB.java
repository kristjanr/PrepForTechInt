package sg.kristjan.CtCi.ch03.ex3_3;


import sg.kristjan.CtCi.ch03.Stack;

import java.util.ArrayList;


class StackOfPlatesB {
    private ArrayList<Stack> stacks = new ArrayList<>();
    private Stack top = new Stack();
    private static final int MAX_HEIGHT = 2;
    private int currentStack = 0;

    public void push(int data) {
        if (top.getHeight() == MAX_HEIGHT) {
            stacks.add(top);
            top = new Stack();
            currentStack += 1;
        }
        top.push(data);
    }

    public Object pop() {
        Object data = top.pop();
        if (top.getHeight() == 0) {
            currentStack -= 1;
            if (currentStack >= 0) {
                top = stacks.get(currentStack);
                stacks.remove(currentStack);
            } else {
                top = new Stack();
            }
        }
        return data;
    }

    public Object popAt(int index) {
        return stacks.get(index).pop();
    }
}
