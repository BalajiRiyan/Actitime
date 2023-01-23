package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public WebDriver driver;
@org.testng.annotations.Parameters("browser")
@BeforeTest
public void openBrowser(String browser) {
		if(browser.equals("chrome")) {
	Reporter.log("Open Browser",true);
	driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) {
	    Reporter.log("Open Browser",true);
		driver = new EdgeDriver();	
		}
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");	
}
@AfterTest
public void closeBrowser() {
	Reporter.log("Close Browser",true);
	driver.close();
}
@BeforeMethod
public void login() {
	
}

}
