package sg.kristjan.ctci.ch03.ex3_6;


import java.util.Calendar;
import java.util.Date;

public abstract class Animal {
    private String name;
    private Date arrivalTime;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrived() {
        arrivalTime = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
    }
}
