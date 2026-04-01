package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src/test/resources/AppFeatures/order.feature"},
	glue = {"stepdefinitions"},
	plugin = {"pretty"}
			)


	public class OrderTest {
}
