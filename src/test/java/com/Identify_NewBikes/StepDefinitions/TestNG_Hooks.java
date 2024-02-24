package com.Identify_NewBikes.StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Identify_NewBikes.Utils.Helper;
import com.Identify_NewBikes.Utils.WebDriverManager;

import io.cucumber.junit.CucumberOptions;

public class TestNG_Hooks implements Hooks{

	static WebDriver driver;
	static Properties p;
	
	@Override
	@Parameters({ "browser" })
	@BeforeClass
	public void setUp(String browser) throws IOException {
		driver=WebDriverManager.getInstance().createDriver(browser);
		p = Helper.getProperties();			//calling the properties method
		driver.manage().window().maximize();	//maximizing the windows
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	//waiting the for the page loading 
		driver.get(p.getProperty("appURL"));	//opening the browser with given appURL
	}

	@Override
	@AfterClass
	public void tearDown() {
		WebDriverManager.getInstance().quitDriver();
	}

	@Override
	public void setUp() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
