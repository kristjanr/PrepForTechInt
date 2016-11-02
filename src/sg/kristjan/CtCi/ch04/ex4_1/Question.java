package sg.kristjan.CtCi.ch04.ex4_1;

import sg.kristjan.CtCi.ch03.Queue;
import sg.kristjan.CtCi.ch04.Graph;
import sg.kristjan.CtCi.ch04.Node;


public class Question {
    public static boolean routeExistsBetweenNodes(Graph graph, int nodeAPos, int nodeBPos) {
        boolean routeFromAtoB = routeFromFirstToSecond(graph, nodeAPos, nodeBPos);
        boolean routeFromBtoA = routeFromFirstToSecond(graph, nodeBPos, nodeAPos);
        return routeFromAtoB || routeFromBtoA;
    }

    private static boolean routeFromFirstToSecond(Graph graph, int nodeAPos, int nodeBPos) {
        for (Node n : graph.nodes) {
            n.marked = false;
        }
        Node a = graph.nodes[nodeAPos];
        Node b = graph.nodes[nodeBPos];
        Queue<Node> queue = new Queue<>();
        queue.add(a);
        while (!queue.isEmpty()) {
            a = queue.remove();
            if (a == b) return true;
            if (a != null) {
                for (Node c : a.adjacent) {
                    if (!c.marked) queue.add(c);
                }
                a.marked = true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        a.adjacent.add(b);
        b.adjacent.add(c);
        Graph graph = new Graph();
        graph.nodes = new Node[]{a, b, c};
        System.out.println(routeExistsBetweenNodes(graph, 0, 2));
    }
}
