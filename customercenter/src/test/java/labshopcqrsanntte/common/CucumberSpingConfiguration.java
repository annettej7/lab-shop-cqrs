package labshopcqrsanntte.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrsanntte.CustomercenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterApplication.class })
public class CucumberSpingConfiguration {}
