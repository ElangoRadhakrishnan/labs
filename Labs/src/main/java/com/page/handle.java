package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class handle {
	//global access
	public WebDriver driver;
	
	
	//constructor
	
	public handle(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	//Drop down
@FindBy(xpath = "//select[@class='product_sort_container' ]/option[1]")

public WebElement Drop1;

@FindBy (xpath = "//select[@class='product_sort_container' ]/option[2]")

public WebElement Drop2;

@FindBy (xpath = "//select[@class='product_sort_container' ]/option[3]")

public WebElement Drop3;

@FindBy(xpath = "//select[@class='product_sort_container' ]/option[4]")

public WebElement Drop4;

//Allproduct view

@FindBy(xpath = "//a[@id='item_5_title_link']")

public WebElement jacket;


@FindBy(xpath = "//button[@class='inventory_details_back_button']")

public WebElement back;

@FindBy(xpath = "//a[@id='item_4_title_link']")

public WebElement backpack;

@FindBy(xpath = "//a[@id='item_3_title_link']")

public WebElement Redtees;

@FindBy(xpath = "//a[@id='item_1_title_link']")

public WebElement Boldtees;

@FindBy(xpath = "//a[@id='item_0_title_link']")

public WebElement redlight;

@FindBy(xpath = "//a[@id='item_2_title_link']")

public WebElement RedThunder;












public void action() throws InterruptedException {
	//drop down actions
	Drop1.click();
	Thread.sleep(3000);
	Drop2.click();
	Thread.sleep(3000);
	Drop3.click();
	Thread.sleep(3000);
	Drop4.click();
	Thread.sleep(3000);

	// All view
	Thread.sleep(2000);

	jacket.click();

	Thread.sleep(3000);

	back.click();

	Thread.sleep(3000);
	backpack.click();

	Thread.sleep(2000);
	back.click();

	Thread.sleep(2000);

	Redtees.click();

	Thread.sleep(2000);
	back.click();

	Thread.sleep(2000);
	Boldtees.click();

	Thread.sleep(2000);
	back.click();

	Thread.sleep(2000);
	redlight.click();

	Thread.sleep(2000);
	back.click();

	Thread.sleep(2000);
	RedThunder.click();
	
	Thread.sleep(2000);
	back.click();
	
}
	
	
	
	
	
	
	
}
