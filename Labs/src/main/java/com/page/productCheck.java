package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productCheck {
	
	//Global Access
	
	public WebDriver driver;
	
	
	//Constructor
	
	public productCheck(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	
	public WebElement Fleece;
	
	
	@FindBy(xpath = "//body//div[@id='page_wrapper']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]")
	
	public WebElement Backpack;
	
	@FindBy(xpath = "//div[5]//div[3]//button[1]")
	
	public WebElement Bikelight;
	
	@FindBy(xpath = "//div[4]//div[3]//button[1]")
	
	public WebElement Bolt;
	
	
	public void product() throws InterruptedException {
		
		//Add to cart
		Thread.sleep(2000);
		Fleece.click();
		Thread.sleep(2000);
		Backpack.click();
		Thread.sleep(2000);
		Bikelight.click();
		Thread.sleep(2000);
		Bolt.click();
		
		
	}
	
	
}
