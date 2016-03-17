package org.TestNG.app.BingTranslator.getpageobjects;

import org.TestNG.app.BingTranslator.Keywords.BingTranslatorAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class BaseUI{
	protected WebDriver driver;
	
	public BingTranslatorAction bingT;
	
	public BaseUI(WebDriver driver) {
		this.driver = driver;
	}

	public void geturl(){
		//driver.Manage().Window.Size = new Size(1024, 768);
		//driver.manage().window().maximize();
		driver.get("http://www.bing.com/translator/");
	}
	public WebElement getInputText(){
	
		return driver.findElement(By.cssSelector("#srcText"));
	}
	public WebElement getSourceLanguage()
	{
		return driver.findElement(By.xpath("//*[contains(@class,'sourceText')]//*[@class='dropdownArrow']"));
	}
	public WebElement getTargetLanguage()
	{
		return driver.findElement(By.xpath("//*[contains(@class,'destinationText')]//*[@class='dropdownArrow']"));
	}
	public WebElement getTranslateButton()
	{
		return driver.findElement(By.cssSelector("#TranslateButton"));
	}
	public WebElement getOutputText()
	{
		return driver.findElement(By.xpath("//*[@id='destText']"));
	}
	public WebElement getSwapButton()
	{
		return driver.findElement(By.cssSelector(".button.swapButton.active"));
		//.//*[@class='swapButtonPanel']/div
	}
	
	public void selectSrcLanguage(String lang) {
		driver.findElement(By.xpath("//*[contains(@class,'sourceText')]//*[contains(@class,'LanguageList')]//td[contains(.,'" + lang + "')]")).click();
	}

	public void selectDstLanguage(String lang) {
		driver.findElement(By.xpath("//*[contains(@class,'destinationText')]//*[contains(@class,'LanguageList')]//td[contains(.,'" + lang + "')]")).click();
	}
	
	public void closeBrowserSession(){
		driver.quit();
	}
}
