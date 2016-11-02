package sg.kristjan.CtCi.ch03.ex3_5;


import java.util.Stack;

class Question {
    public static Stack sortStack(Stack<Integer> original) {
        Stack<Integer> temp = new Stack<>();
        Integer biggest = null;
        int sortedItems = 0;
        int stackSize = 0;

        // first ordering needs to be separate, since we need to know the stack size
        while (!original.isEmpty()) {
            stackSize += 1;

            int current = original.pop();
            if (biggest == null) {
                biggest = current;
            } else if (current > biggest) {
                temp.push(biggest);
                biggest = current;
            } else {
                temp.push(current);
            }
        }
        original.push(biggest);
        biggest = null;
        sortedItems += 1;

        while (sortedItems <= stackSize) {
            while (!temp.isEmpty()) {
                original.push(temp.pop());
            }

            int itemsToMove = stackSize - sortedItems;
            int itemsMoved = 0;
            while (itemsMoved <= itemsToMove) {
                int current = original.pop();
                if (biggest == null) {
                    biggest = current;
                } else if (current > biggest) {
                    temp.push(biggest);
                    biggest = current;
                } else {
                    temp.push(current);
                }
                itemsMoved += 1;
            }
            original.push(biggest);
            biggest = null;
            sortedItems += 1;
        }
        return original;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(3);

        System.out.println(sortStack(s));

    }
}