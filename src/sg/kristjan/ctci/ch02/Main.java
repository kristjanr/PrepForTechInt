package sg.kristjan.ctci.ch02;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list.first());
        list.remove(2);
        System.out.println(list.first());
        list.remove(3);
        System.out.println(list.first());


        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.add(1);
        dlist.add(2);
        dlist.add(3);
        System.out.println(dlist);
        System.out.println(dlist.toStringReverse());
        dlist.remove(3);
        System.out.println(dlist);
        System.out.println(dlist.toStringReverse());
        dlist.add(3);
        dlist.remove(1);
        System.out.println(dlist);
        System.out.println(dlist.toStringReverse());

    }


}
