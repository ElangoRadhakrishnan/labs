package com.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validate {

	
	//global access
	
	public WebDriver driver;
	
	
	//constructor
	
	public validate(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements( driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	
	public WebElement fname;
	
	@FindBy(xpath ="//input[@id='last-name']")
	
	public WebElement lname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	
	public WebElement pcode;
	
	@FindBy(xpath = "//input[@class='btn_primary cart_button']")
	
	public WebElement button;
	
	@FindBy(xpath = "//a[@class='btn_action cart_button']")
	
	public WebElement Finish;
	
	
	@FindBy(xpath = "//button[normalize-space()='Open Menu']")
	
	public WebElement Nav;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	
	public WebElement logout;
	
	public void last() throws InterruptedException  {
	
		Thread.sleep(2000);
		
		fname.sendKeys("Dominc");
		
		Thread.sleep(2000);
		
		lname.sendKeys("paul");
		
		Thread.sleep(2000);
		
		pcode.sendKeys("10001");
		
		Thread.sleep(2000);
		button.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        js.executeScript("window.scrollBy(0,3000)");
        
        Thread.sleep(2000);
        
        Finish.click();
        
        Thread.sleep(2000);

        Nav.click();
        
        Thread.sleep(2000);
        
        logout.click();
  
        
        
		
		
		
	}
	
	
	
	
	
	
	
}
