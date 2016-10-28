package sg.kristjan.CtCi.ch3.ex3_3;

/**
 * Created by kristjanroosild on 23/10/16.
 */
public class QuestionB {
    public static void main(String[] args) {
        StackOfPlatesB sop = new StackOfPlatesB();
        sop.push(1);
        sop.push(2);
        sop.push(3);
        System.out.println(sop.popAt(0));
        System.out.println(sop.popAt(0));
        System.out.println(sop.popAt(0));
    }
}
