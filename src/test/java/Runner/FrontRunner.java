package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/FrontAcc.feature", 
					glue = "StepDefinition", 
					monochrome = true,
					dryRun = false,
					plugin= {"pretty","html:target/frontacc.html","json:target/JSONReport/reportfrontacc.json"})

public class FrontRunner {

}
