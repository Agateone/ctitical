package Elements;



import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Register_Page_Elements {
	 public static String  randomEmail;
	
	 WebDriver driver_Register_Page_Elements;

	By Email = By.name("email");
	By Email_Continue = By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div/input");
	By marketing = By.xpath("//*[@id=\"app\"]/div/div/form/div[1]/div/div[1]/label/input");
	By second_marketing = By.xpath("//*[@id=\"app\"]/div/div/form/div[1]/div/div[2]/label/input");
	By Marketing_Continue = By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div/input");
	By Change_My_Preferences = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/a");
	By Missingout_Continue= By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div");
	By Add_Payment_Details = By.xpath("//*[@id=\"app\"]/div/div/form/div[3]/div/input");																										//confirm password textbox
	By Register_Page_topup_3= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/section[1]/div/div[2]/label[1]");
	By Register_Page_pay_by_card=By.className("braintree-option__label");	//card payment button
	By Register_Page_Card_Number= By.name("credit-card-number");	
	By Register_Page_Card_Expiry_Date= By.id("expiration");	
	By Register_Page_cvv= By.id("cvv"); 
	By Postcode= By.name("postal-code");
	By First_name = By.name("firstName");
	By Last_name = By.name("lastName");
	By Phone_number= By.name("phoneNumber");
	By Address_line = By.name("addressLine1");
	By Card_details_continue = By.xpath("//*[@id=\"app\"]/div/div/div[2]/input");
	By Auto_top_up = By.xpath("//*[@id=\"app\"]/div/div/form/div[1]/div/div/div[1]/label/span");
	By Auto_pay = By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div/div/div[1]/label/span");
	By Final_continue = By.xpath("//*[@id=\"app\"]/div/div/form/div[3]/div/input");	
	By Register_Page_Voucher = By.name("voucher");
	By voucher_page_continue = By.xpath("/html/body/div/div/div/form/div[3]/div/input");
	By voucher_lable_3=  By.xpath("//*[@id=\"app\"]/div/div/form/div[1]/div/div/label[2]");
	

	public Register_Page_Elements(WebDriver driver_Register_Page_Elements2) {			//constructor
		this.driver_Register_Page_Elements= driver_Register_Page_Elements2;
	}
	
	public static String randomEmail() {
        return "axateone+test" + UUID.randomUUID().toString() + "@gmail.com";
   
        
	}

	
	

	public void Registration1() throws InterruptedException {
		
		randomEmail = randomEmail();		
		driver_Register_Page_Elements.findElement(Email).sendKeys(randomEmail);
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(Email_Continue).click();
		Thread.sleep(4000);
	}
		

		public void Registration2() throws InterruptedException {		
		driver_Register_Page_Elements.findElement(Marketing_Continue).click();
		Thread.sleep(4000);
		}
		
		public void Registration22() throws InterruptedException {	
			
			driver_Register_Page_Elements.findElement(Missingout_Continue).click();
			Thread.sleep(4000);
			}
		public void Registration3() throws InterruptedException {	
			
		driver_Register_Page_Elements.findElement(Change_My_Preferences).click();
		Thread.sleep(4000);
		}
		
		public void Registration4() throws InterruptedException {		
		driver_Register_Page_Elements.findElement(marketing).click();
		Thread.sleep(4000);
		
		driver_Register_Page_Elements.findElement(second_marketing).click();
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(Marketing_Continue).click();
		Thread.sleep(4000);
		
		}

public void Registration5() throws InterruptedException {	
	Thread.sleep(6000);
	driver_Register_Page_Elements.findElement(Add_Payment_Details).click();
	Thread.sleep(4000);
}

public void Registration6() throws InterruptedException {	
	Thread.sleep(10000);
	driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
	Thread.sleep(5000);		
}
public void Registration7() throws InterruptedException {	
		
		
		
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Number));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("5573617070265811");
		driver_Register_Page_Elements.switchTo().defaultContent();
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Expiry_Date));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("1121");
		driver_Register_Page_Elements.switchTo().defaultContent();		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-cvv");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_cvv));
		driver_Register_Page_Elements.findElement(Register_Page_cvv).sendKeys("690");
		driver_Register_Page_Elements.switchTo().defaultContent();	
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-postalCode");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Postcode));
		driver_Register_Page_Elements.findElement(Postcode).sendKeys("E35QX");		
		Thread.sleep(3000);
		driver_Register_Page_Elements.switchTo().defaultContent();			
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(First_name).sendKeys("victoria");
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(Last_name).sendKeys("Silberbaur");
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(Phone_number).sendKeys("07592209873");
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(Address_line).sendKeys("22 barge crescent");
		Thread.sleep(4000);
		driver_Register_Page_Elements.findElement(Card_details_continue).click();
		Thread.sleep(10000);
				
	}

public void Registration8() throws InterruptedException {	
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(Final_continue).click();
	Thread.sleep(4000);
}

public void Registration9() throws InterruptedException {	
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(Auto_pay).click();
	Thread.sleep(4000);
}
public void Registration11() throws InterruptedException {	
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(Auto_top_up).click();
	Thread.sleep(4000);
}

public void Registration10() throws InterruptedException {	
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(Register_Page_Voucher).sendKeys("jay123456");
	Thread.sleep(6000);
	driver_Register_Page_Elements.findElement(voucher_page_continue).click();
	Thread.sleep(4000);
}

public void Registration15() throws InterruptedException {	
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(Register_Page_Voucher).sendKeys("jay1111");
	Thread.sleep(4000);
	driver_Register_Page_Elements.findElement(voucher_lable_3).click();
	Thread.sleep(6000);
	driver_Register_Page_Elements.findElement(voucher_page_continue).click();
	Thread.sleep(4000);
}
	
	/*public void Registration_Process() throws InterruptedException, IOException  {		//enter values to Register page elements and hit Register
		
	
		
		
	String url= 	driver_Register_Page_Elements.getCurrentUrl();
		
	if(url.contains("reaction"))
	{
		
	
		
		
		
Thread.sleep(1000);
		
	
		Thread.sleep(10000);
		
		
		
		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1234567");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
		
		
	}	
		
		
	
	if(url.contains("popbitch"))
	{
		
	

		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
		
		
	}	
	

	if(url.contains("cricketer"))
	{
		
	
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("No one pound top up active on cricketer ");
			
		}
		else
		{
			System.out.println("1£ top up active on cricketer :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		
		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("JAY1234567");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
	}	
	

	if(url.contains("cornwall"))
	{
		
	
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("JAY1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
	}	
	
	if(url.contains("maidenhead"))
	{
		
	
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("JAY1234567");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
	
		
		
	}	
	
	
	if(url.contains("slough"))
	{
		
	
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("JAY1234567");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
		
	}	
	
	if(url.contains("windsor"))
	{
		
	
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("JAY1234567");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
		
	}	
	
	
	if(url.contains("newburytoday"))
	{
		
	
		
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on newbury :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on newbury ");
			
			
		}
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
		
	}	
	
	
	if(url.contains("roanoke-chowannewsherald"))
	{
	
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		
	}	
	
	
	
	if(url.contains("scifinow"))
	{
		
	
		
Thread.sleep(1000);
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		//Screenshot
		//String screenshot_name_2= "Registration_step1_2";
		String timestamp_2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_2 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_2, new File("/Users/jay/Desktop/scifi/"+"_"+timestamp_2+"_"+"jpg" ));
		
		
		
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
		
		
		
		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		
	
		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/scifi/" +"_"+timestamp_3+"_"+"jpg" ));
		
		
		
	}	
	
	if(url.contains("examinerlive"))
	{	
		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		driver_Register_Page_Elements.findElement(Register_Page_topup_1).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);
			
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		//Thread.sleep(5000);		
		//driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		//Thread.sleep(1000);
		//driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		//Thread.sleep(3000);
		//driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		//Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		
driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		
		driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4751290228503710");
		Thread.sleep(400);
		driver_Register_Page_Elements.switchTo().defaultContent();
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0223");
		driver_Register_Page_Elements.switchTo().defaultContent();
		Thread.sleep(400);
		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-cvv");
		
		driver_Register_Page_Elements.findElement(By.id("cvv")).sendKeys("986");
		driver_Register_Page_Elements.switchTo().defaultContent();
		Thread.sleep(400);
		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-postalCode");
		
		driver_Register_Page_Elements.findElement(By.id("postal-code")).sendKeys("Hp22 7BH");
		
		driver_Register_Page_Elements.switchTo().defaultContent();
		
		
		
	}	
	
	
	if(url.contains("grantham"))
	{	
		
		
		
				
Thread.sleep(1000);		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/grantham/" +"_"+timestamp_3+"_"+"jpg" ));
		
	}	
	
	
	
	if(url.contains("stamfordmercury"))
	{	
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		//Screenshot
		//String screenshot_name_1= "Registration_step1_2";
		String timestamp_1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_1 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile_1, new File("/Users/jay/Desktop/stamfordmercury/" +"_"+timestamp_1+"_"+"jpg" ));		
Thread.sleep(1000);		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		//Screenshot
		//String screenshot_name_2= "Registration_step1_2";
		String timestamp_2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_2 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_2, new File("/Users/jay/Desktop/stamfordmercury/"+"_"+timestamp_2+"_"+"jpg" ));		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/stamfordmercury/" +"_"+timestamp_3+"_"+"jpg" ));
		
	}	
	
	if(url.contains("spaldingtoday"))
	{	
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		//Screenshot
		//String screenshot_name_1= "Registration_step1_2";
		String timestamp_1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_1 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile_1, new File("/Users/jay/Desktop/spalding/" +"_"+timestamp_1+"_"+"jpg" ));		
Thread.sleep(1000);		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		//Screenshot
		//String screenshot_name_2= "Registration_step1_2";
		String timestamp_2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_2 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_2, new File("/Users/jay/Desktop/spalding/"+"_"+timestamp_2+"_"+"jpg" ));		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/spalding/" +"_"+timestamp_3+"_"+"jpg" ));
		
	}	
	
	if(url.contains("fenlandcitizen"))
	{	
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		//Screenshot
		//String screenshot_name_1= "Registration_step1_2";
		String timestamp_1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_1 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile_1, new File("/Users/jay/Desktop/fenland/" +"_"+timestamp_1+"_"+"jpg" ));		
Thread.sleep(1000);		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		//Screenshot
		//String screenshot_name_2= "Registration_step1_2";
		String timestamp_2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_2 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_2, new File("/Users/jay/Desktop/fenland/"+"_"+timestamp_2+"_"+"jpg" ));		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/fenland/" +"_"+timestamp_3+"_"+"jpg" ));
		
	}	
	
	
	if(url.contains("newarkadvertiser"))
	{	
		
boolean one_pound_top_up = driver_Register_Page_Elements.findElement(Register_Page_topup_1).isDisplayed();
		
		boolean expected_one_pound = false;
		
		if(one_pound_top_up==expected_one_pound)
		{
			
			System.out.println("1£ top up is not active on cornwall :::: java programm has stopped!!!, Please fix it ");
		       System.exit(1);
			
		}
		else
		{
			System.out.println("one pound top up active on cornwall ");
			
			
		}
		
		
		
		
		//Screenshot
		//String screenshot_name_1= "Registration_step1_2";
		String timestamp_1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_1 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile_1, new File("/Users/jay/Desktop/newark/" +"_"+timestamp_1+"_"+"jpg" ));		
Thread.sleep(1000);		
		driver_Register_Page_Elements.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		//Screenshot
		//String screenshot_name_2= "Registration_step1_2";
		String timestamp_2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_2 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_2, new File("/Users/jay/Desktop/newark/"+"_"+timestamp_2+"_"+"jpg" ));		
		//driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
		//Thread.sleep(2000);
		//driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		//System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(5000);		
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
		Thread.sleep(2000);
		driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
		Thread.sleep(1000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
		Thread.sleep(3000);
		driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);		
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();
		//driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		//Thread.sleep(400);
		//driver_Register_Page_Elements.switchTo().defaultContent();		
		//Screenshot
		//String screenshot_name_3= "Registration_step1_2";
		String timestamp_3 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile_3 = ((TakesScreenshot)driver_Register_Page_Elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile_3, new File("/Users/jay/Desktop/newark/" +"_"+timestamp_3+"_"+"jpg" ));
		
	}	
	Thread.sleep(10000);
		driver_Register_Page_Elements.findElement(Register_page_2_Continue).click();
		
		System.out.println("\n"+"Registered with the email "+ randomEmail +"\n");
		
	}
	
	
	
	

	

	public void wait_untill_page_has_loaded() throws InterruptedException									//Click Register from login page
	{
		
		
		
		Thread.sleep(12000);
		WebElement email = driver_Register_Page_Elements.findElement(Register_Page_email);
		Boolean email_displayed = email.isDisplayed();
		if(email_displayed==true)
		{
			System.out.println("navigated to registration page");
		}
		else
		{
			System.out.println("did not navigate to registration page, please check ");
		}
		
	}

	/*public void Capture_Login_Details() {											//display values of login page elements
		String Login_Page_email_value = driver_Login_Page_Elements.findElement(Login_Page_email).getAttribute("value");
		System.out.println(Login_Page_email_value);
		String Login_Page_password_value= driver_Login_Page_Elements.findElement(Login_Page_password).getAttribute("value");
		System.out.println(Login_Page_password_value);
		driver_Login_Page_Elements.findElement(Login_Page_remember_me).isSelected();
	}
			
	public void Click_On_Register_From_Login_Page()									//Click Register from login page
	{
		driver_Login_Page_Elements.findElement(Login_Page_register).click();
	}

	public void Click_on_Forgot_Password_link()										//Click on Forgot password from login page
	{
		driver_Login_Page_Elements.findElement(Login_Page_forgot_password).click();
	}

	public void Click_On_Login_Page_Find_out_More()
	{								//Find out more of cookies from login page
		driver_Login_Page_Elements.findElement(Login_Page_cookies_findoutmore).click();
	}
*/
	
	}
	
