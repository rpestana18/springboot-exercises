package src.main.test.com.springboot.restful.exercise;

import com.springboot.restful.exercise.main.SpringbootApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = SpringbootApplication.class)
@ExtendWith(SpringExtension.class)
public class ApplicationTests {


    @Test
    public void contextLoads() {
    }


}
