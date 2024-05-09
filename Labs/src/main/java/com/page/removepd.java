package com.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class removepd {
	
	//Global Accesss
	
	public WebDriver driver;
	
	
	//constructor
	
	public removepd(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']")
	
	public WebElement Carticon;
	
	@FindBy(xpath = "(//button [@class='btn_secondary cart_button'])[4]")
	
	public WebElement remove;
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	
	public WebElement ck;
	
	
	public void icon() throws InterruptedException {
		
		
		Carticon.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        js.executeScript("window.scrollBy(0,2000)");
        
       
 		remove.click();
 		Thread.sleep(2000);
 		
 		ck.click();

 		
        
  

		
		
	}
	
}
