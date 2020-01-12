package noesis.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/noesis/desafio1", }

		, glue = { "noesis.desafio1", }

		, monochrome = true, plugin = { "html:target/cucumber-reports" })

public class TestRunner {

}
