package org.TestNG.app.BingTranslator.getpageobjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.TestNG.app.BingTranslator.Keywords.BingTranslatorAction;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Setup {
	public WebDriver driver;
	public BingTranslatorAction bingT;
	
	public Setup(String browser)  {
		if(browser.equals("local")){
			setupForLocal();
		}
		else if(browser.equals("remote")){
			setupForRemote();
		}
		init();
	}
	
	public void setupForLocal(){
		driver = new FirefoxDriver();
	}
	
	public void setupForRemote(){
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		//String nodeUrl = "http://10.0.22.253:5566/wd/hub";
		String nodeUrl = "http://localhost:4444/wd/hub";
		URL selserverhost = null;
		try{
			selserverhost = new URL(nodeUrl);
			}catch(MalformedURLException e){
				System.out.println("MalformedURLException" +e);
			}
		DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(selserverhost, cap);
	}
	
	public void init()
	{
		bingT= new BingTranslatorAction(driver);
	}
	
}
