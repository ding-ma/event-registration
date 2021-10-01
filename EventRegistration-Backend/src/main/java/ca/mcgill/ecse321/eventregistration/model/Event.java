package ca.mcgill.ecse321.eventregistration.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
@ToString
public class Event {
    @Id
    private String name;
    private Date date;
    private Time startTime;
    private Time endTime;

}
