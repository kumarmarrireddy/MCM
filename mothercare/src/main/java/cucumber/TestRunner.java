package cucumber;



import org.junit.runner.RunWith;
import cucumber.api.junit.cucumber;
import cucumber.api.TestRunnerOptions;

@RunWith(cucumber.class)

	@TestRunnerOptions(
			
		format={"pretty","html:reports/test-report"},
		tags={ "@smokeTest"},
        feature= "/mothercare/src/main/java/cucumber/Featurefile.Feture"
		
		)


	public class TestRunner{

	

	

	}

	


public class TestRunner {

}
