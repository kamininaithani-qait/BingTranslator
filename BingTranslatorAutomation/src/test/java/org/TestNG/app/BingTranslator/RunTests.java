package org.TestNG.app.BingTranslator;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@CucumberOptions(features = "src/test/resources/Features/sample.feature",glue="stepDefination",
	format = {"pretty"})
public class RunTests extends AbstractTestNGCucumberTests {

	

} 