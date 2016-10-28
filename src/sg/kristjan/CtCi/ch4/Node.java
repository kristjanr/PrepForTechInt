package sg.kristjan.CtCi.ch4;


import java.util.ArrayList;

public class Node {
    public ArrayList<Node> adjacent = new ArrayList<>();
    private String name;
    public boolean marked = false;

    public Node(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
