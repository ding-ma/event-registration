package ca.mcgill.ecse321.eventregistration.service;

import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;

@Component
public class EventRegistrationValidator {

    public void validateCreateEvent(String name, Date date, Time startTime, Time endTime){
        String error = "";
        if (name == null || name.trim().length() == 0) {
            error = error + "Event name cannot be empty! ";
        }
        if (date == null) {
            error = error + "Event date cannot be empty! ";
        }
        if (startTime == null) {
            error = error + "Event start time cannot be empty! ";
        }
        if (endTime == null) {
            error = error + "Event end time cannot be empty! ";
        }
        if (endTime != null && startTime != null && endTime.before(startTime)) {
            error = error + "Event end time cannot be before event start time!";
        }
        error = error.trim();
        if (error.length() > 0) {
            throw new IllegalArgumentException(error);
        }
    }
}
