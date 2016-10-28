package sg.kristjan.CtCi.ch4.ex4_6;



public class Question {
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n2 = new Node(2);
        Node n1 = new Node(n0, 1, n2);
        n0.parent=n1;
        n2.parent=n1;
        Node n5 = new Node(5);
        Node n4 = new Node(n1, 4, n5);
        n5.parent=n4;
        n1.parent=n4;

        System.out.println(n0.next());
        System.out.println(n1.next());
        System.out.println(n2.next());
        System.out.println(n4.next());
        System.out.println(n5.next());
    }
}
