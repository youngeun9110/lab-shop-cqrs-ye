package labshopcqrsye.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrsye.CustomercenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterApplication.class })
public class CucumberSpingConfiguration {}
