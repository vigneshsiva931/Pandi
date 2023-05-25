package org.adactin.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Adactin_FeatureFiles", glue = "org.adactin.stepdef",dryRun=false)
public class TestRunner {

}
