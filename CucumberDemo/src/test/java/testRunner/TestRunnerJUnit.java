package testRunner;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import Steps.EbayHome_Steps;
import io.cucumber.java.AfterStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, glue = { "Steps" }, plugin = { "pretty",
		"json:target/json-report/Cucumber.json" }, dryRun = false, monochrome = true, tags = "@P3 or @P1")
public class TestRunnerJUnit {

}
