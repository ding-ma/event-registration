package ca.mcgill.ecse321.eventregistration.repository;

import ca.mcgill.ecse321.eventregistration.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event, Integer> {
    List<Event> findEventByStartTimeAfterAndEndTimeBefore(Time start, Time end);
}
