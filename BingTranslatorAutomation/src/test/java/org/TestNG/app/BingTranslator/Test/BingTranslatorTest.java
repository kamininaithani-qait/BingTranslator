package org.TestNG.app.BingTranslator.Test;

import org.TestNG.app.BingTranslator.getpageobjects.Setup;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BingTranslatorTest {
	//WebDriver driver;
	//BaseUI base = new BaseUI(driver);
	Setup obj;
	@BeforeTest
	public void setup(){
		//local//remote
		 obj = new Setup("local");
		 //obj = new Setup("remote");
	}
	
	@Test
	public void Test_01() {
		obj.bingT.launch_Browser();
		obj.bingT.translate_Word();
	}

	@AfterTest
	public void close_Test_Session() {
		obj.bingT.closeBrowserSession();
	}

}
