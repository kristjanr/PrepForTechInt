package sg.kristjan.CtCi.ch02.ex;

import sg.kristjan.CtCi.ch02.SinglyLinkedList;
import sg.kristjan.CtCi.ch02.ex.ex2_1.QuestionA;
import sg.kristjan.CtCi.ch02.ex.ex2_4.Question;

import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        QuestionA q = new QuestionA();
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(1);
        System.out.println(ll);
        System.out.println(q.removeDupes(ll));

        SinglyLinkedList slist = new SinglyLinkedList();
        slist.add(1);
        slist.add(2);
        slist.add(4);
        slist.add(2);
        slist.add(3);
        slist.add(7);
        slist.add(4);
        slist.add(6);
        System.out.println(slist);
        System.out.println(slist.first());
        System.out.println(slist.last());
        System.out.println(Question.partitioned(slist, 4));



    }
}
