package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/Login.feature"},
glue = {"stepdefinitions"},

plugin = {"pretty"
}
		)
public class LoginTest {

}
