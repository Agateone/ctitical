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
import Elements.Register_Page_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Successfull_Auto_Top_Up {
	
	 WebDriver driver;
		
	 @Test(priority=14)
	 @Given("I register on maidenhead with auto top up ON")
	
	public void I_register_on_maidenhead_with_auto_top_up_ON() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://www.maidenhead-advertiser.co.uk/news/remember-when/152676/remember-when-neighbours-star-draws-a-crowd-and-protests-over-m4-widening.html");
		Thread.sleep(10000);
        
	    
	}

	 @Test(priority=15)
	@When("My balance gets below one pound")	
	public void My_balance_gets_below_one_pound() throws InterruptedException, IOException {
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
  
  	R1.Registration5();
	R1.Registration6();
	R1.Registration7();
	R1.Registration11();
	Thread.sleep(20000);
	R1.Registration8(); 
	Thread.sleep(10000);
	driver.switchTo().window(parentWindowHandler);
	Popbitch_Finish_Notice_elements F1 = new Popbitch_Finish_Notice_elements(driver);
	F1.click_on_popbitch_finish_Notice_ok();
	Thread.sleep(4000);
	}

	 @Test(priority=16)
	@Then("I see a wallet with three pounds")
	
	public void i_see_a_wallet_with_three_pounds() throws InterruptedException {
		
		 driver.navigate().refresh();
			
			Thread.sleep(4000);		
			
  	  	
	}

	

}
