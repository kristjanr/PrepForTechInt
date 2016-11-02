package sg.kristjan.CtCi.ch04.ex4_7;

import java.util.ArrayList;


public class Question {
    public static void main(String[] args) {
        String[] projects = new String[]{"ab", "bc", "ca"};
        ArrayList<String[]> dependencies = new ArrayList<>();
        String[] pair1 = new String[2];
        pair1[0] = "bc";
        pair1[1] = "ab";
        dependencies.add(pair1);
        String[] pair2 = new String[2];
        pair2[0] = "ab";
        pair2[1] = "bc";
        dependencies.add(pair2);
        Projects projs = new Projects(projects, dependencies);
        System.out.println(projs);
        System.out.println(projs.buildOrder());
    }
}
