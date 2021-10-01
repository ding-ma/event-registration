package ca.mcgill.ecse321.eventregistration.repository;

import ca.mcgill.ecse321.eventregistration.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonCRUD extends CrudRepository<Person, Integer> {
    Person findByName(String name);

    List<Person> findByNameContaining(String name);
}
