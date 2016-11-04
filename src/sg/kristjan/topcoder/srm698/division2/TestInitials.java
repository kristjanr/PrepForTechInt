package sg.kristjan.topcoder.srm698.division2;

import java.util.Objects;

public class TestInitials {
    public static void main(String[] args) {
        Initials in = new Initials();
        assert Objects.equals("jfk", in.getInitials("john fitzgerald kennedy"));
        assert Objects.equals("s", in.getInitials("single"));
        assert Objects.equals("s", in.getInitials("s"));
        assert Objects.equals("lgtm", in.getInitials("looks good to me"));
        assert Objects.equals("aaaaabbbbb", in.getInitials("a aa aaa aa a bbb bb b bb bbb"));
    }
}
