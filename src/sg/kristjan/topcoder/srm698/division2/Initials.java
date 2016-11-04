package sg.kristjan.topcoder.srm698.division2;



/**
 * https://community.topcoder.com/stat?c=problem_statement&pm=14389&rd=16802
 * Problem Statement
 * When dealing with long names and phrases, we sometimes use the initial letters of words to form its acronym. For example, we use "JFK" instead of "John Fitzgerald Kennedy", "lgtm" instead of "looks good to me", and so on.
 * You are given a String name. This String contains a phrase: one or more words separated by single spaces. Please compute and return the acronym of this phrase. (As above, the acronym should consist of the first letter of each word, in order.)
 * <p>
 * Definition
 * <p>
 * Class:	Initials
 * Method:	getInitials
 * Parameters:	String
 * Returns:	String
 * Method signature:	String getInitials(String name)
 * (be sure your method is public)
 * <p>
 * <p>
 * Constraints
 * -	name will contain between 1 and 50 characters, inclusive.
 * -	Each character in s will be a space or a lowercase English letter ('a' - 'z').
 * -	The first and last character in s will not be a space.
 * -	No two continuous spaces can appear in s.
 * <p>
 * Examples
 * 0) "john fitzgerald kennedy"
 * Returns: "jfk"
 * There are three words: "john", "fitzgerald" and "kennedy". Their first letters are 'j', 'f' and 'k'. The correct return value is their concatenation: the string "jfk". Note that all letters in our problem are in lowercase.
 * <p>
 * 1) "single"
 * Returns: "s"
 * There is only one word: "single". Its acronym has a single letter.
 * <p>
 * 2) "looks good to me"
 * Returns: "lgtm"
 * <p>
 * 3)  "single round match"
 * Returns: "srm"
 * <p>
 * 4) "a aa aaa aa a bbb bb b bb bbb"
 * Returns: "aaaaabbbbb"
 * <p>
 * SOLUTION DESCRIPTION:
 * Create a char array from the string, loop through it and add to Stringbuilder
 * whenever the previous value was space
 * Corner cases? Constraints are so good that there do not seem to be any corner cases
 * Can there be a faster solution or something which less memory? The time and space are both O(n). Can I do better?
 * Yes, I can iterate through the original string and use charAt method to get the character.
 * Space will still be O(n) though, because we need to return a new string.
 **/

public class Initials {
    public String getInitials(String name) {
        StringBuilder sb = new StringBuilder(name.length());
        sb.append(String.valueOf(name.charAt(0)));
        boolean previousWasSpace = false;
        for (int i = 0; i <= name.length() - 1; i++) {
            char c = name.charAt(i);
            if (c == ' ') {
                previousWasSpace = true;
                continue;
            }
            if (previousWasSpace) {
                sb.append(String.valueOf(c));
                previousWasSpace = false;
            }
        }
        return sb.toString();
    }
}
