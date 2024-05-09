package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navbar {

	//global accesss
	
	public WebDriver driver;
	
	
	// Constructor
	

	public Navbar(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//div[@class='bm-burger-button']")
	
	public WebElement Navigation;
	
	@FindBy(xpath = "//div[@class='bm-cross-button']")
	
	public WebElement Cross;
	
	
	
	
	
	
	
	public void bar() throws InterruptedException {
		
		//Nav actions
		Navigation.click();
		Thread.sleep(2000);
		
		//Nav Close
		
		Cross.click();
		
		
	}
	
	
	
	
	
	
}


