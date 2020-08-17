package Stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Elements.PopbitchFirstUseNoticeElements;
import Elements.Popbitch_Finish_Notice_elements;
import Elements.Popbitch_Wallet_Elements_staging;
import Elements.Register_Page_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Funds_From_Top_Up_Notice {
	
	 WebDriver driver;
	 String parentWindowHandler;
	 
	

	
	@Given("I am a new user and choose to register")
	@Test(priority=1)
	public void i_am_a_new_user_and_choose_to_register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/jay/eclipse-workspace/chromedriver");
		
    	driver= new ChromeDriver();
    	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        PopbitchFirstUseNoticeElements w1 = new PopbitchFirstUseNoticeElements(driver);
        w1.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
        Assert.assertTrue(true);
        parentWindowHandler = driver.getWindowHandle();
	    
	}

	
	@When("I enter a new email and click on continue")
	@Test(priority=2)
	public void i_enter_a_new_email_and_click_on_continue() throws InterruptedException {
		Thread.sleep(4000);  
		
		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		
  	  Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  		 R1.Registration1();
	}

	
	@When("I click on continue on marketing preferences page without opting")
	@Test(priority=3)
	public void i_click_on_continue_on_marketing_preferences_page_without_opting() throws InterruptedException {
Thread.sleep(4000);  
		

String subWindowHandler = null;
Set<String> handles = driver.getWindowHandles(); // get all window handles
Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		
  	  Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  		 R1.Registration2();
  	  		 
	}

	
	@When("I click on change My preferences on missing out page")
	@Test(priority=4)
	public void i_click_on_change_My_preferences_on_missing_out_page() throws InterruptedException {
		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		
  	  Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  		 R1.Registration3();
	}

	
	@When("I opt to share personal data and offers and click on continue")
	@Test(priority=5)
	public void i_opt_to_share_personal_data_and_offers_and_click_on_continue() throws InterruptedException {
		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		
  	  Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  		 R1.Registration4();
	}

	
	
	@When("return to the article")
	public void return_to_the_article() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click on add funds on top up notice")
	public void i_click_on_add_funds_on_top_up_notice() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
