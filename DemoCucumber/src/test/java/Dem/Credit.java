package Dem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
features = {helpers.Address.FEATURES_LOCATION},
tags={"@T-Credit"},
plugin = { "html:target/Cucumber-Junit-Reports","json:target/JsonReports/cucumber-reports.json"},
glue = {"steps"}
)



public class Credit {

}
