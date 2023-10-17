package labshopcqrsye.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrsye.InventoryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventoryApplication.class })
public class CucumberSpingConfiguration {}
