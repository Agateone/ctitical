package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Top_up_Elements {

	WebDriver driver_Top_up_Elements_Staging;

	//login page elements finding
	By Add_payment = By.xpath("//*[@id=\"app\"]/div/div/form/div[3]/div/input");
	
	

	public Top_up_Elements(WebDriver driver_Top_up_Elements_Staging2) {				//constructor
		this.driver_Top_up_Elements_Staging= driver_Top_up_Elements_Staging2;
	}
	
	
	
	
	public void click_on_add_payment() throws InterruptedException									//Click on topup in the wallet
	{	
		Thread.sleep(8000);
		
		
		driver_Top_up_Elements_Staging.findElement(Add_payment).click();		
		
	}
	
	
	
	
	
	
}
