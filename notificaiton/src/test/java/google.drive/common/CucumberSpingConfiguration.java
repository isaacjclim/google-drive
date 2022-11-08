package google.drive.common;


import google.drive.NotificaitonApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificaitonApplication.class })
public class CucumberSpingConfiguration {
    
}
