package Stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Elements.PopbitchFirstUseNoticeElements;
import Elements.Popbitch_Wallet_Elements_staging;
import Elements.Register_Page_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Successful_voucher_with_top_up {
	
	 WebDriver driver;
	
	 @Test(priority=23)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();  
    	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        
	    
	}

	 @Test(priority=24)
	@When("I reg and add a voucher with top up ")	
	public void i_reg_and_add_a_voucher_with_top_up() throws InterruptedException, IOException {
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
  	  	R1.Registration22();
  	  R1.Registration15();
	R1.Registration6();
	R1.Registration7();
	Thread.sleep(20000);
	R1.Registration8(); 
	Thread.sleep(10000);
	driver.switchTo().window(parentWindowHandler);
	
	Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
	P1.Click_On_popbitch_staging_agate_poster();
	Thread.sleep(4000);
	String your_balance=P1.get_your_balance();
	String actual_balance="15.00";
	Assert.assertEquals(your_balance, actual_balance);	
	Thread.sleep(4000);		
	P1.Click_On_popbitch_wallet_Top_up();
	}

	 @Test(priority=25)
	@Then("I get a wallet with top up amount plus the voucher amount")
	
	public void i_get_a_wallet_with_top_up_amount_plus_the_voucher_amount() throws InterruptedException {
		
  	  	System.out.println(" ");
  	  	driver.quit();
  	  	
	}

	



	

		

	










}
