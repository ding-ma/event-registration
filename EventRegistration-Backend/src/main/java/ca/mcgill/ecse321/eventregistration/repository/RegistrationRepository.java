package ca.mcgill.ecse321.eventregistration.repository;

import ca.mcgill.ecse321.eventregistration.model.Event;
import ca.mcgill.ecse321.eventregistration.model.Person;
import ca.mcgill.ecse321.eventregistration.model.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

    List<Registration> findByPerson(Person personName);

    boolean existsByPersonAndEvent(Person person, Event eventName);

    Registration findByPersonAndEvent(Person person, Event eventName);

}
