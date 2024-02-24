package com.Identify_NewBikes.StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Identify_NewBikes.Utils.Helper;
import com.Identify_NewBikes.Utils.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Junit_Hooks implements Hooks{

	static WebDriver driver;
	static Properties p;
	
	@Override
	@Before
	public void setUp() throws IOException {
		driver=WebDriverManager.getInstance().createDriver("chrome");	//calling the initializeBrowser method
		p = Helper.getProperties();			//calling the properties method
		driver.manage().window().maximize();	//maximizing the windows
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	//waiting the for the page loading 
		driver.get(p.getProperty("appURL"));	//opening the browser with given appURL
		
	}

	@Override
	@After
	public void tearDown() {
		WebDriverManager.getInstance().quitDriver();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		// this is for cucumber junit report
		if (!scenario.isFailed()) {		//if scenario is passed
			TakesScreenshot ts = (TakesScreenshot) driver;		//taking screenshot using takingScreenshot interfacess
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);	
			scenario.attach(screenshot, "image/png", scenario.getName());	//attaching the screen shot 
		}
	}

	@Override
	public void setUp(String browser) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
