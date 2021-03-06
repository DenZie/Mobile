
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/ApiumCal.feature",
		glue = {"apium"})
public class TestRunner  {
	
}
