package sg.kristjan.ctci.ch01.ex.e1_1;

import java.util.Hashtable;

public class Question {

    public static boolean isUnique(String s) {
        Hashtable<Character, Character> ht = new Hashtable<>();

        for (char c : s.toCharArray()) {
            Character character = ht.get(c);
            if (character != null) return false;
            ht.put(c, c);
        }
        return true;
    }


    public static boolean isUnique2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }


    public static boolean isUniqueChars2(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }


    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

}