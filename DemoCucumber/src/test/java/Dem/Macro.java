package Dem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = {helpers.Address.FEATURES_LOCATION},
glue = {"step"},
dryRun = false, 
monochrome = true,
tags = "@macroFilter"
)
@RunWith(Cucumber.class)



public class Macro {

}
