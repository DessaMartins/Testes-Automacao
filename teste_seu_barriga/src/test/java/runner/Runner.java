package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/feature/ContasSeuBarriga.feature",
		glue = {""},
		tags = "@All",
		monochrome = true,
		dryRun = false
		)

public class Runner {

}
