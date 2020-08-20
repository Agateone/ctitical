package Stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Elements.Authorise_charge_notice_popbitch;
import Elements.Cornwall_Reports_FUN;
import Elements.Popbitch_Finish_Notice_elements;
import Elements.Popbitch_Wallet_Elements_staging;
import Elements.Register_Page_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Successful_transaction_from_authoirse_charge_notice {
	
	 WebDriver driver;
	 
	
	 
	 
	 
	
	 @Test(priority=7)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(16500);				
		driver.findElement(By.xpath("/html/body/div[1]/button")).click();
        
	    
	}

	 @Test(priority=8)
	@When("I register")	
	public void i_register() throws InterruptedException, IOException {
		 String parentWindowHandler = driver.getWindowHandle();
		 Thread.sleep(4000);
		 Cornwall_Reports_FUN cornwall = new Cornwall_Reports_FUN(driver);
			cornwall.Click_On_Cornwall_First_Use_CreateWallet();
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
  	R1.Registration10();
	driver.switchTo().window(parentWindowHandler);
	Popbitch_Finish_Notice_elements F1 = new Popbitch_Finish_Notice_elements(driver);
	F1.click_on_popbitch_finish_Notice_ok();
	Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
	P1.Click_On_popbitch_staging_agate_poster();
	Thread.sleep(4000);
	String your_balance=P1.get_your_balance();
	String actual_balance="0.80";
	Assert.assertEquals(your_balance, actual_balance);	
	Thread.sleep(4000);	
	
	}

	 @Test(priority=9)
	@Then("I see a wallet with three pounds")
	
	public void i_see_a_wallet_with_three_pounds() throws InterruptedException, IOException {
		
  	  	driver.navigate().to("https://cornwallreports.co.uk/european-union-puts-1-8-million-into-new-helicopter-link-to-isles-of-scilly/");
		/* Thread.sleep(4000);
		 Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(16500);				
			driver.findElement(By.xpath("/html/body/div[1]/button")).click();
		 Authorise_charge_notice_popbitch AT1 = new Authorise_charge_notice_popbitch(driver);
		 AT1.authorise_charge_notice_click_continue();
		 Thread.sleep(4000);*/
		 System.out.println(" ");
		 driver.quit();
  	  	
	}

	



	

		

	










}
