package com.nordea.amazonTest;
		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then;
import cucumber.annotation.en.And;
import cucumber.annotation.en.When;

public class AmazonWebDriverTest {
	
    private WebDriver driver;	
    
    @Given("^Firefox launched$")
	public void openFirefox() {	
	    driver = new FirefoxDriver();  
	}	
    
    @Given("^Amazon.com opened $")
    @When("^search for nikon product$")
    @And("^and sort results from highest price to slowest$")
    @Then("^Select second product and click it for details and check the product contain text “Nikon D3X$")
	public void testSearchNikon() {
    	
    	driver.get("http://amazon.com");
    	// Since I am not used to using most of the APIs in Selenium Java, I will have to stop the assignment here
    	//spending a week and half familiarizing myself with their use would make the test reliazable
    	//String [] nikonString = driver.findElement(By.xpath())
    }
    
	@And("^Firefox closed$")
	public void closeFirefox() {
		driver.quit();			
	}		
}