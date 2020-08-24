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

public class Wallet_balance_free_point_on_publications {
	
	 WebDriver driver;
	
	 @Test(priority=26)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        
	    
	}

	 @Test(priority=27)
	@When("I reg on popbitch and navigate to grantham")	
	public void i_reg_on_popbitch_and_navigate_to_grantham() throws InterruptedException, IOException {
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
	
	
	Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
	P1.Click_On_popbitch_staging_agate_poster();
	Thread.sleep(4000);
	String your_balance=P1.get_your_balance();
	String actual_balance="3.00";
	Assert.assertEquals(your_balance, actual_balance);	
	String PPA= P1.price_per_article_on_wallet();
	String actual_price_per_article= "0.25";
	Assert.assertEquals(PPA, actual_price_per_article);
	Thread.sleep(4000);
	String FP= P1.Free_point();
	String actual_free_point= "0.50";
	Assert.assertEquals(FP,actual_free_point);
	Thread.sleep(6000);	
	driver.get("https://www.granthamjournal.co.uk/news/stowaway-crab-rescued-from-grantham-train-9078953/");
	Thread.sleep(10000);
	P1.Click_On_popbitch_staging_agate_poster();
	String your_balance1=P1.get_your_balance();
	String actual_balance1="3.00";
	Assert.assertEquals(your_balance1, actual_balance1);	
	String PPA1= P1.price_per_article_on_wallet();
	String actual_price_per_article1= "0.20";
	Assert.assertEquals(PPA1, actual_price_per_article1);
	Thread.sleep(4000);
	String FP1= P1.Free_point();
	String actual_free_point1= "0.20";
	Assert.assertEquals(FP1, actual_free_point1);
	
	}

	 @Test(priority=28)
	@Then("wallet balance is same on both publications")
	
	public void wallet_balance_is_same_on_both_publications() throws InterruptedException {
		
  	  	System.out.println(" ");
  	  	driver.quit();
  	  	
	}

	



	

		

	










}
