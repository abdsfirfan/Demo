package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/NaveenKhunteta/Documents/workspace/FreeCrmBDDFramework/src/main/java/Features/taggedhooks.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			plugin = {"pretty"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = true //to check the mapping is proper between feature file and step def file
			
			)
	 
	public class TestRunner {
	 
	}
	