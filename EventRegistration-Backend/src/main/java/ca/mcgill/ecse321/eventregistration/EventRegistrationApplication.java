package ca.mcgill.ecse321.eventregistration;

import ca.mcgill.ecse321.eventregistration.model.Event;
import ca.mcgill.ecse321.eventregistration.model.Person;
import ca.mcgill.ecse321.eventregistration.repository.EventRegistrationRepository;
import ca.mcgill.ecse321.eventregistration.repository.PersonCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventRegistrationApplication.class, args);
	}

	@Autowired
	private EventRegistrationRepository eventRegistrationRepository;

	@Autowired
	private PersonCRUD personCRUD;

	@RequestMapping("/")
	public String greeting(){
		Person person= eventRegistrationRepository.createPerson("bob");
		Person p = new Person("banana");
		personCRUD.save(p);
		personCRUD.save(new Person("aaaaaa"));
		return "Hello world! from github actions";
	}

	@GetMapping("/person")
	public List<Person> getP(){
		return personCRUD.findByNameContaining("b");
	}

}
