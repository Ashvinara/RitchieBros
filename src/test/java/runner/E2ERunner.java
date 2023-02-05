package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/test/resources/CucumberTest",
		glue = {"StepDefinition"}, 
				plugin = { "pretty", "html:target14/cucumber-reports",
						"json:target15/cucumber-reports/Cucumber.json",
						"junit:target16/cucumber-reports/Cucumber.xml",
						
						},
						
			   monochrome = true
		
				
		
		)
public class E2ERunner {
	
}

