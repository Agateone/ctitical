package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Popbitch_Wallet_Elements_staging {

	WebDriver driver_Popbitch_Wallet_Elements_staging;

	//login page elements finding
	By green_tab= By.xpath("//*[@id=\"wallet\"]/span/div/div[2]/div/div[2]/svg");																	
	By Your_balance = By.id("total_amount__currency__amount");	
	
	
	By Popbitch_Wallet_Elements_staging_topup_button= By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[3]/button");									//password text box
	By Popbitch_Wallet_Elements_staging_publication_name= By.xpath("//*[@id=\"wallet\"]/div[2]/div/div[2]/p[1]");								//remember me check box
	By Popbitch_Wallet_Elements_staging_price_per_article= By.xpath("//*[@id=\"wallet__price_per_article__currency__amount\"]");								//sign in button
	By Popbitch_Wallet_Elements_staging_current_free_point_balance= By.id("gauge__per_article__currency__amount");

	public Popbitch_Wallet_Elements_staging(WebDriver driver_Popbitch_Wallet_Elements_staging2) {				//constructor
		this.driver_Popbitch_Wallet_Elements_staging= driver_Popbitch_Wallet_Elements_staging2;
	}
	
	public void Click_On_popbitch_staging_agate_poster()	
	{
	
	WebElement element = driver_Popbitch_Wallet_Elements_staging.findElement(By.id("agateposter"));				
	Actions actions = new Actions(driver_Popbitch_Wallet_Elements_staging);
	actions.moveToElement(element);
	actions.click().perform();//Click on the green tab to open the wallet
	}
	
	
	public void Click_On_popbitch_wallet_Top_up() throws InterruptedException									//Click on topup in the wallet
	{	Thread.sleep(3000);
	driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
	
		driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_topup_button).click();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
	}

	public String get_your_balance() throws InterruptedException // current wallet balance
	{
		
				Thread.sleep(2000);
				driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
				String current_Balance = driver_Popbitch_Wallet_Elements_staging.findElement(Your_balance).getText();
				driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
				return current_Balance;
				
	}
	

	public String Free_point()throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		String current_Free_Point = driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_current_free_point_balance).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return current_Free_Point;
		
	}
	
	
	public String Free_point_free()throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		String current_Free_Point = driver_Popbitch_Wallet_Elements_staging.findElement(By.className("textInsideGauge_perArticle__rhWV2")).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return current_Free_Point;
		
	}
	
	
	public String price_per_article_on_wallet() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		String Popbitch_wallet_price_per_article = driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_price_per_article).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return Popbitch_wallet_price_per_article;
		
	}
	
}
