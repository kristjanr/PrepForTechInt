package sg.kristjan.CtCi.ch4.ex4_7;

import java.util.ArrayList;


public class Question {
    public static void main(String[] args) {
        String[] projects = new String[]{"a", "b", "c"};
        ArrayList<String[]> dependencies = new ArrayList<>();
        String[] pair1 = new String[2];
        pair1[0] = "b";
        pair1[1] = "a";
        dependencies.add(pair1);
        String[] pair2 = new String[2];
        pair2[0] = "a";
        pair2[1] = "b";
        dependencies.add(pair2);
        Projects projs = new Projects(projects, dependencies);
        System.out.println(projs);
        System.out.println(projs.buildOrder());
    }
}
