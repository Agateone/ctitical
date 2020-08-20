package Stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Elements.New_Pub_Notice;
import Elements.PopbitchFirstUseNoticeElements;
import Elements.Popbitch_Finish_Notice_elements;
import Elements.Popbitch_Wallet_Elements_staging;
import Elements.Register_Page_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Successful_transaction_from_New_Publication_Notice {
	
	 WebDriver driver;
		
	 @Test(priority=10)
	 @Given("I am a new user")
	
	public void i_am_a_new_user() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");		
    	driver= new ChromeDriver();   	
    	driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
        Assert.assertTrue(true);
        Thread.sleep(10000);
        
	    
	}

	 @Test(priority=11)
	@When("I register from popbitch")	
	public void i_register_from_popbitch() throws InterruptedException, IOException {
		 String parentWindowHandler = driver.getWindowHandle();
		 Thread.sleep(4000);
		PopbitchFirstUseNoticeElements w1 = new PopbitchFirstUseNoticeElements(driver);
        w1.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
        Assert.assertTrue(true);
         
         Thread.sleep(8000);
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
	  	 
	  	R1.Registration10();
	  	driver.switchTo().window(parentWindowHandler);
		Thread.sleep(6000);
		Popbitch_Wallet_Elements_staging P1 = new Popbitch_Wallet_Elements_staging(driver);
		P1.Click_On_popbitch_staging_agate_poster();
		Thread.sleep(10000);
	Popbitch_Finish_Notice_elements F1 = new Popbitch_Finish_Notice_elements(driver);
	F1.click_on_popbitch_finish_Notice_ok();
		
	/*	driver.switchTo().frame("iframe__popup_notices");
		WebElement element = driver.findElement(By.id("finish_button"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		driver.switchTo().defaultContent();*/
		
	Thread.sleep(4000);
	}
/*
	 @Test(priority=12)
		@When("I navigate to cornwall")	
		public void i_navigate_to_cornwall() throws InterruptedException, IOException {
			
		 driver.navigate().to("https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/");
		 Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(16500);				
			driver.findElement(By.xpath("/html/body/div[1]/button")).click();
			Thread.sleep(4000);
		}
	 @Test(priority=13)
		@Then("I can transact from New publication notice")	
		public void i_can_transact_from_New_publication_notice() throws InterruptedException, IOException {
			 Thread.sleep(4000);
				New_Pub_Notice N1 = new New_Pub_Notice(driver);
				N1.newpub_charge_notice_click_continue();
		}*/
	
}
