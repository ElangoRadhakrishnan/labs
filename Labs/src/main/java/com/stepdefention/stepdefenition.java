package com.stepdefention;

import org.openqa.selenium.WebDriver;

import com.hook.hook;
import com.page.Navbar;
import com.page.handle;
import com.page.login;
import com.page.productCheck;
import com.page.removepd;
import com.page.validate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefenition {


	public WebDriver driver= hook.driver;
	
	login ss;
	handle le;
	Navbar nav;
	productCheck pc;
	removepd prod;
	validate val;
	
	
@Given("open the Chrome")
public void open_the_chrome() throws InterruptedException {
    login ss = new login(driver);
    
    ss.log();
}

@When("Login creditials")
public void login_creditials() throws InterruptedException {
	
	handle le = new handle(driver);
	
	le.action();
    
}

@When("Click the hamburger menu")
public void click_the_hamburger_menu() throws InterruptedException {
    Navbar nav = new Navbar(driver);
    
    nav.bar();
}

@When("Drop down validation")
public void drop_down_validation() throws InterruptedException {
	productCheck pc = new productCheck(driver);
	
	pc.product();
}


@When("check more outcomes")
public void check_more_outcomes() throws InterruptedException {
	
	removepd prod = new removepd(driver);
	
	prod.icon();
}


@Then("I validate Cart")
public void i_validate_cart() throws InterruptedException {
   
	validate val = new validate(driver);
	
	val.last();
}


	
	
	
	
	
}
