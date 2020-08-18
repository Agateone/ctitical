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

public class Successful_Registration_from_FUN_with_Top_Up {
	
	 WebDriver driver;
	 String parentWindowHandler;
	
	 
	 
	 
	
	 @Test(priority=1)
	 @Given("I am a new user and choose to register")
	
	public void i_am_a_new_user_and_choose_to_register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        PopbitchFirstUseNoticeElements w1 = new PopbitchFirstUseNoticeElements(driver);
        w1.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
        Assert.assertTrue(true);
        String parentWindowHandler = driver.getWindowHandle();
	    
	}

	 @Test(priority=2)
	@When("I enter a new email and click on continue")
	
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

	 @Test(priority=3)
	@When("I click on continue on marketing preferences page without opting")
	
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

	 @Test(priority=4)
	@When("I click on change My preferences on missing out page")
	
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

	 @Test(priority=5)
	@When("I opt to share personal data and offers and click on continue")
	
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

	 @Test(priority=6)
	@When("choose Three pounds on top up page and click on Add Payment details")
	
	public void choose_Three_pounds_on_top_up_page_and_click_on_Add_Payment_details() throws InterruptedException {		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window		
		Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  	R1.Registration5();
	}

		@Test(priority=7)
	@When("choose card on payment options page")

	public void choose_card_on_payment_options_page() throws InterruptedException {		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window		
		Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  	R1.Registration6();
	}

		@Test(priority=8)
	@When("enter valid card details and billing details and click on continue")
	
	public void enter_valid_card_details_and_billing_details_and_click_on_continue() throws InterruptedException {		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window		
		Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  	R1.Registration7();
	}

		@Test(priority=9)
	@When("choose auto top up OFF and Auto pay On and click on confirm")
	
	public void choose_auto_top_up_OFF_and_Auto_pay_On_and_click_on_confirm() throws InterruptedException {		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		Thread.sleep(20000);	
		Register_Page_Elements R1 = new Register_Page_Elements(driver);
  	  	R1.Registration8(); 
	}

		@Test(priority=10)
	@Then("I see a finish notice")
	
	public void i_see_a_finish_notice() throws InterruptedException, IOException {
		driver.switchTo().window(parentWindowHandler);		
		Thread.sleep(10000);
		//Popbitch_Finish_Notice_elements F1 = new Popbitch_Finish_Notice_elements(driver);
		 //F1.click_on_popbitch_finish_Notice_ok();	
	}

		@Test(priority=11)
	@Then("Three pounds in the wallet")
	
	public void three_pounds_in_the_wallet() throws InterruptedException {
		Thread.sleep(4000);
		Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
		P1.Click_On_popbitch_staging_agate_poster();
		String your_balance=P1.get_your_balance();
		String actual_balance="3.00";
		Assert.assertEquals(your_balance, actual_balance);		
	}

		@Test(priority=12)
	@Then("Auto top up off shows ADD FUNDS on the wallet")
	
	public void auto_top_up_off_shows_ADD_FUNDS_on_the_wallet() throws InterruptedException {
		Thread.sleep(4000);
		Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);		
		P1.Click_On_popbitch_wallet_Top_up();	
	}













}
