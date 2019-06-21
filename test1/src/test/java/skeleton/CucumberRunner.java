package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty","html: src/cucumber-reports","json: src/cucumber-reports/reports.json"},
		monochrome = true,
		features = "src/test/resources/skeleton/data_driven.feature",
		dryRun=false)
public class CucumberRunner {

}
