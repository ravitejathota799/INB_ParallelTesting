package com.Identify_NewBikes.Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Helper{

	static WebDriver driver; //creating an webdriver instance 
	static Properties p;	//creating an instance to access properties from config.properties file 
	static Logger logger;	//creating an instance to logger 

	@SuppressWarnings("deprecation")
	@Parameters("browser")
	//Method for initializing browser with two environments remote and local
	public static WebDriver initilizeBrowser(String browser) throws IOException {
		
		 if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		 }
		driver.manage().deleteAllCookies();		//deleting all the cookies 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		return driver;		//returning the webdriver

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static Properties getProperties() throws IOException {
		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties"); //config file path

		p = new Properties(); 	//creating an object for the properties
		p.load(file);			//loading properties file	
		return p;				//returning the properties object
	}

	public static Logger getLoggers() {
		logger = LogManager.getLogger(); // Log4j
		return logger;
	}

	
}
