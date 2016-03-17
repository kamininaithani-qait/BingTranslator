package stepDefination;

import org.TestNG.app.BingTranslator.getpageobjects.Setup;
import org.testng.annotations.BeforeMethod;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BingTranslatorCucumberTest {

	Setup obj;
//	@BeforeMethod
//	public void setup(){
//		 
//		 //obj = new Setup("remote");
//	}

	@Given("^run launch URL browser$")
	public void launch_browser(){
		 obj = new Setup("local");
		 obj.bingT.launch_Browser();
	}
	
	@When("^I run the translate word$")
	public void Test_01_translate_word() {
		obj.bingT.translate_Word();
	}

	@Then("^run should be successful$")
	public void close_Test_Session() {
		obj.bingT.closeBrowserSession();
	}
}
