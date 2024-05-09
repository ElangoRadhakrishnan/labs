package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	//global access
	public WebDriver driver;
	
	
	//constructor
	
	public login(WebDriver driver) {
		
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}

	
	@FindBy(xpath = "//input[@id='user-name']")
	
	public WebElement Username;
	
	
	@FindBy(xpath = "//input[@id='password']")
	
	public WebElement Password;
	
	
	@FindBy(xpath = "//input[@id='login-button']")
	
	public WebElement click;
	
	
	
	
	
	
	
	
	public void log() throws InterruptedException {
		Username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		Password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		click.click();
		
		
	}
	
	
	
	
	
}
