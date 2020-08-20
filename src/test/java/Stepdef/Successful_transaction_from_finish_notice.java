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

public class Successful_transaction_from_finish_notice {
	
	 WebDriver driver;
	
	 @Test(priority=17)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        
	    
	}

	 @Test(priority=18)
	@When("I register")	
	public void i_register() throws InterruptedException, IOException {
		 String parentWindowHandler = driver.getWindowHandle();
		 Thread.sleep(4000);
		PopbitchFirstUseNoticeElements w1 = new PopbitchFirstUseNoticeElements(driver);
        w1.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
        Assert.assertTrue(true);
         
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
  	  Thread.sleep(4000);  		
	  	R1.Registration2();	  		
  	  	R1.Registration3();
  	  R1.Registration4();
  	R1.Registration5();
	R1.Registration6();
	R1.Registration7();
	Thread.sleep(20000);
	R1.Registration8(); 
	Thread.sleep(10000);
	driver.switchTo().window(parentWindowHandler);
	Popbitch_Finish_Notice_elements F1 = new Popbitch_Finish_Notice_elements(driver);
	F1.click_on_popbitch_finish_Notice_ok();
	Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
	P1.Click_On_popbitch_staging_agate_poster();
	Thread.sleep(4000);
	String your_balance=P1.get_your_balance();
	String actual_balance="2.75";
	Assert.assertEquals(your_balance, actual_balance);	
	Thread.sleep(4000);		
	P1.Click_On_popbitch_wallet_Top_up();
	}

	 @Test(priority=19)
	@Then("I can transact from finish notice")
	
	public void i_can_transact_from_finish_notice() throws InterruptedException {
		
  	  	System.out.println(" ");
  	  	driver.quit();
  	  	
	}

	



	

		

	










}
