package ca.mcgill.ecse321.eventregistration;

import ca.mcgill.ecse321.eventregistration.model.Person;
import ca.mcgill.ecse321.eventregistration.repository.PersonRepository;
import ca.mcgill.ecse321.eventregistration.service.EventRegistrationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class TestEventRegistrationService {
    @Mock
    private PersonRepository personDao;
    
    @InjectMocks
    private EventRegistrationService service;
    
    private static final String PERSON_KEY = "TestPerson";
    
    @BeforeEach
    public void setMockOutput() {
        lenient().when(personDao.findPersonByName(anyString())).thenAnswer( (InvocationOnMock invocation) -> {
            if(invocation.getArgument(0).equals(PERSON_KEY)) {
                Person person = new Person();
                person.setName(PERSON_KEY);
                return person;
            } else {
                return null;
            }
        });
        
//        TODO mock all your other repository access
    }
    
    @Test
    public void testAddPerson(){
        Person p = service.createPerson(PERSON_KEY);
        Person db = service.getPerson(PERSON_KEY);
        assertEquals(p.getName(), db.getName());
    }
    
}
