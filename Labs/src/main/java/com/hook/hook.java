package com.hook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hook {
	
	
public static WebDriver driver;
	
	@Before
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	
	@After
	public void teardown() {
		
		driver.close();
	}


}
