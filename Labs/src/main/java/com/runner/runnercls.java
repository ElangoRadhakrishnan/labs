package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		
		features = "src/test/resources/features",
		glue = {"com.hook","com.stepdefention"},
		dryRun= false,
		monochrome =  true,
		publish =true,
		tags = "",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
		
		"html:target/cucumberreport/report.html",
		
		"json:target/cucumberreport/report.json",
		
		"junit:target/cucumberreport/report.xml"
		
		}
		
		
		
		
		
		
		
		)

	









public class runnercls extends AbstractTestNGCucumberTests{

	@Override
	
	@DataProvider(parallel =false)
	
	public Object[][] scenarios(){
		
		return super.scenarios();		
	}
}
