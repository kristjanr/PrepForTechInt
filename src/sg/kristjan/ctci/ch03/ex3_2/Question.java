package sg.kristjan.ctci.ch03.ex3_2;

/**
 * Created by kristjanroosild on 23/10/16.
 */
public class Question {

    public static void main(String[] args) {
        StackMin sm = new StackMin();
        sm.push(1);
        sm.push(1);
        sm.push(2);
        System.out.println(sm.min());
        System.out.println(sm.peek());

        System.out.println(sm.pop());

        System.out.println(sm.pop());
        System.out.println(sm.min());

        System.out.println(sm.pop());
        System.out.println(sm.isEmpty());
    }
}
