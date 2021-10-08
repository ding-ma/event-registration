package ca.mcgill.ecse321.eventregistration.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.sql.Date;

@Entity
@ToString
public class Event {
    @Id
    private String name;
    private Date date;

    public Event() {
    }

    public Event(String name, Date date, Time startTime, Time endTime) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    private Time startTime;

    private Time endTime;

}
