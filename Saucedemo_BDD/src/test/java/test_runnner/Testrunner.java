package test_runnner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		tags = "",
		features = {"src\\test\\resources\\feature_files"},
		dryRun = false,
		glue = {"step_definition" },
		plugin = {"html:report/cucmberreport"}
		)

public class Testrunner extends AbstractTestNGCucumberTests {

}
