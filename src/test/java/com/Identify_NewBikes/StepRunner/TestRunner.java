package com.Identify_NewBikes.StepRunner;

import java.io.IOException;

import org.junit.runner.RunWith;
import com.Identify_NewBikes.StepDefinitions.Hooks;
import com.Identify_NewBikes.StepDefinitions.Junit_Hooks;
import com.Identify_NewBikes.StepDefinitions.TestNG_Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/Features/Identify_NewBikes_E2E.feature", }, glue = "com.Identify_NewBikes.StepDefinitions", plugin = {
				"pretty", "rerun:target/rerun.txt", "html:Cucumber-reports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false, monochrome = true)


public class TestRunner{

	public static void main(String[] args) throws IOException {
		Hooks hooks = new Junit_Hooks();
		hooks.setUp("");
		hooks.tearDown();
	}
}
