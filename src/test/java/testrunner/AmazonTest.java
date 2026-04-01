package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/order.feature"},
glue = {"stepdefinitions", "MyHooks"},
tags = "@User2",

plugin = {"pretty",
"json:target/MyReports/report.json",
"junit:target/MyReports/report.xml"

}
		)
public class AmazonTest {

}
