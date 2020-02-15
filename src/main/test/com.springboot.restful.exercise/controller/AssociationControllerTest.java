package src.main.test.com.springboot.restful.exercise.controller;

import java.util.List;
import com.springboot.restful.exercise.dao.AssociationRepository;
import com.springboot.restful.exercise.model.Association;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import src.main.test.com.springboot.restful.exercise.ApplicationTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Person Controller Methods")
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // need to marc or set the repository instance with static
public class AssociationControllerTest extends ApplicationTests {
    
    @Autowired
    AssociationRepository repository;

    @BeforeAll
    public void addAssociations(){
        repository.save(new Association(1L, "Associacao 1", "94552377000105"));
        repository.save(new Association(2L, "Associacao 2", "39161767000138"));
        repository.save(new Association(3L, "Associacao 3", "87841782000170"));
        repository.save(new Association(4L, "Associacao 4", "76957541000174"));
    }

    @AfterAll
    public void removeAll(){
        repository.deleteAll();
    }

    @Test
    public void listAssociationsTest() {

    	List<Association> l = repository.findAll();
        assertEquals(4, l.size());
    }
}
