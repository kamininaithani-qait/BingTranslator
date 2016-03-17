package org.TestNG.app.BingTranslator.Keywords;

import org.TestNG.app.BingTranslator.getpageobjects.BaseUI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class BingTranslatorAction extends BaseUI{
	public BingTranslatorAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public CSVfileReader CSV= new CSVfileReader();
	static String outputText[] = new String[50];
	
		public void launch_Browser()
		{
			geturl();
		}
		
		public void translate_Word(){
		
			int size = CSV.i;
			for (int i = 0; i < size; i++) {
				getInputText().clear();
				getSourceLanguage().click();
				selectSrcLanguage(CSV.sourceLang[i]);
				getInputText().sendKeys(CSV.word[i]);
				
				getTargetLanguage().click();
				selectDstLanguage(CSV.targetLang[i]);
				getTranslateButton().click();
				outputText[i] = getOutputText().getText();
				System.out.println("output text :" + outputText[i]);
				swap(outputText[i], i);
			}
		}		

		public void swap(String text, int i) {
			getSwapButton().click();
			getInputText().clear();

			getInputText().sendKeys(text);

			getTranslateButton().click();
			String swapoutputText = getOutputText().getText();
			System.out.println(swapoutputText + "====" + CSV.word[i]);
			Assert.assertEquals(swapoutputText, CSV.word[i], "ASSERT FAIL::::::::: not equal");
			System.out.println("ASSERT PASS:::: equal");

		}

	
}

