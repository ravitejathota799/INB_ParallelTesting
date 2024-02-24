package com.Identify_NewBikes.StepRunner;

import java.io.IOException;

import com.Identify_NewBikes.StepDefinitions.Hooks;
import com.Identify_NewBikes.StepDefinitions.TestNG_Hooks;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = { "src/test/resources/Features/Identify_NewBikes_E2E.feature", }, glue = "com.Identify_NewBikes.StepDefinitions", plugin = {
				"pretty", "rerun:target/rerun.txt", "html:Cucumber-reports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false, monochrome = true)

public class TestNG {

	public static void main(String[] args) throws IOException {
		Hooks hooks = new TestNG_Hooks();
		hooks.setUp("chrome");
		hooks.tearDown();
	}
}
