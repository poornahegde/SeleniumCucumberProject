package case_study;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty","html: src/cucumber-case-reports","json: src/cucumber-case-reports/reports.json"},
		monochrome = true,
		features = "src/test/resources/case_study/login_page.feature",
		dryRun=false)
public class Runner {
	
}
