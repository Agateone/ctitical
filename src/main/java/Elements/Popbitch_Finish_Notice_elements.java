package Elements;


import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;





public class Popbitch_Finish_Notice_elements {
//Instantiate web driver	
	
	WebDriver driver_Popbitch_Finish_Notice_elements;
//Get all finish notice elements of popbitch
	
			
	By Popbitch_Finish_Notice_ok_button= By.xpath("//*[@id=\"finish_button\"]");		
	
//constructor
	
	public Popbitch_Finish_Notice_elements(WebDriver driver_Popbitch_Finish_Notice_elements2) 
	{
	this.driver_Popbitch_Finish_Notice_elements= driver_Popbitch_Finish_Notice_elements2;
	}
//Verify if popbitch finish notice elements are displayed
	
	public void popbitch_click_on_authy_and_ok() throws InterruptedException, IOException {		
		
		WebElement frame = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"iframe__popup_notices\"]"));
		
		driver_Popbitch_Finish_Notice_elements.switchTo().frame(frame);	
				
WebElement authorise_button = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_notice__auto_charge__switch\"]"));
		
	
		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor1.executeScript("arguments[0].click();", authorise_button);
		
		Thread.sleep(4000);
		WebElement authorise = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_button\"]"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor.executeScript("arguments[0].click();", authorise);
		
		
	
	
	
		Thread.sleep(4000);
		
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
	}
	
	
	
	/*public void popbitch_click_ON_on_authy_and_ok() throws InterruptedException {
		
WebElement frame = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"iframe__popup_notices\"]"));
		
		driver_Popbitch_Finish_Notice_elements.switchTo().frame(frame);	
		Thread.sleep(4000);
		WebElement authorise = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_button\"]"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor.executeScript("arguments[0].click();", authorise);
		
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
		
	}*/

	


	
	public void click_on_popbitch_finish_Notice_ok() throws InterruptedException, IOException
	{	Thread.sleep(10000);
	
	driver_Popbitch_Finish_Notice_elements.switchTo().frame("iframe__popup_notices");
		driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[3]/button")).click();
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
		Thread.sleep(4000);

	}	
	}

