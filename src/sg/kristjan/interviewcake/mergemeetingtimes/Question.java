package sg.kristjan.interviewcake.mergemeetingtimes;


import java.util.ArrayList;
import java.util.Arrays;

class Question {

    public static void main(String[] args) {
        Meeting first = new Meeting(5, 10);
        Meeting second = new Meeting(5, 6);
        Meeting third = new Meeting(3, 4);
        Meeting fourth = new Meeting(7, 9);
        // (1, 10), (2, 6), (3, 5), (7, 9)
        Meeting[] arr = new Meeting[]{first, second, third, fourth};
        System.out.println(Arrays.toString(condense(arr)));
    }

    public static Meeting[] condense(Meeting[] meetings) {
        ArrayList<Meeting> res = new ArrayList<>();
        Arrays.sort(meetings);
        System.out.println(Arrays.toString(meetings));
        Meeting previous = meetings[0];
        for (int i = 0; i <= meetings.length - 1; i++) {
            if (previous.touches(meetings[i])) {
                previous.merge(meetings[i]);
            } else {
                res.add(previous);
                previous = meetings[i];
            }
        }

        Meeting[] results = new Meeting[res.size()];
        res.toArray(results);
        return results;
    }
}


class Meeting implements Comparable {


    int startTime;
    int endTime;


    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime = endTime;
    }


    void merge(Meeting other) {
        this.startTime = Math.min(this.startTime, other.startTime);
        this.endTime = Math.max(this.endTime, other.endTime);
    }


    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }

    @Override
    public int compareTo(Object o) {
        if (this.startTime < ((Meeting) o).startTime) {
            return -1;
        } else if (this.startTime > ((Meeting) o).startTime) {
            return 1;
        } else {
            return 0;
        }
    }

    boolean touches(Meeting other) {
        if (this.startTime >= other.startTime && other.startTime <= this.endTime) {
            return true;
        }
        if (this.startTime >= other.endTime && other.endTime <= this.endTime) return true;
        return false;
    }
}
