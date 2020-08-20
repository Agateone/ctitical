package Stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Elements.Add_Funds_Notice;
import Elements.PopbitchFirstUseNoticeElements;
import Elements.Popbitch_Finish_Notice_elements;
import Elements.Popbitch_Wallet_Elements_staging;
import Elements.Register_Page_Elements;
import Elements.Top_up_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Successfull_top_up_from_top_up_notice {
	
	 WebDriver driver;
	 
	
	 
	 
	 
	
	 @Test(priority=4)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/jay/eclipse-workspace/chromedriver");		
		driver= new ChromeDriver();   	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(20000);
	    
	}

	 @Test(priority=5)
	@When("I dont top up during reg")	
	public void i_dont_top_up_during_reg() throws InterruptedException, IOException {
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
	Thread.sleep(10000);
	driver.switchTo().window(parentWindowHandler);
	driver.navigate().refresh();
	Thread.sleep(6000);
	
	Add_Funds_Notice A1 = new Add_Funds_Notice(driver);
	A1.click_on_add_funds_button();
	
	Thread.sleep(4000);
	String subWindowHandler2 = null;
	Set<String> handles2 = driver.getWindowHandles(); // get all window handles
	Iterator<String> iterator2 = handles2.iterator();
	while (iterator2.hasNext()){
	    subWindowHandler2 = iterator2.next();
	}
	driver.switchTo().window(subWindowHandler2);
	
	Thread.sleep(4000);
	Top_up_Elements T1 = new   Top_up_Elements(driver);
	T1.click_on_add_payment();
	
	}

	 @Test(priority=6)
	@Then("I top up with add funds through top up page")
	
	public void i_top_up_with_add_funds_through_top_up_page() throws InterruptedException {
		
  	  	System.out.println(" ");
  	  	driver.quit();
  	  	
	}

	



	

		

	










}
