package ca.mcgill.ecse321.eventregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventRegistrationApplication.class, args);
	}
	
	@RequestMapping("/")
	public String greeting(){
		return "Hello world! from github actions";
	}

}
