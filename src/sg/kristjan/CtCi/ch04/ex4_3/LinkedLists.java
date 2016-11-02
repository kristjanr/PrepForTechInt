package sg.kristjan.CtCi.ch04.ex4_3;

import sg.kristjan.CtCi.ch01.StringBuilder;
import sg.kristjan.CtCi.ch04.TreeNodeInt;

import java.util.ArrayList;
import java.util.LinkedList;


class LinkedLists {
    private ArrayList<LinkedList<TreeNodeInt>> lists = new ArrayList<>();

    public void insertToList(TreeNodeInt node, int depth) throws IndexOutOfBoundsException {
        if (depth < 0) throw new IndexOutOfBoundsException();
        LinkedList<TreeNodeInt> nodes;
        try {
            nodes = lists.get(depth);
        } catch (IndexOutOfBoundsException e) {
            nodes = new LinkedList<>();
            nodes.add(node);
            lists.add(depth, nodes);
            return;
        }
        nodes.add(node);
        lists.set(depth, nodes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<TreeNodeInt> nodes : lists) {
            sb.add(nodes.toString());
            sb.add("; ");
        }
        return sb.toString();
    }
}