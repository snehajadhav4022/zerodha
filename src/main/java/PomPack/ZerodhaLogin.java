package PomPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLogin {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UserID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[@class='button-orange wide']")
	private WebElement Loginbtn;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement continuebtn;
	
		
	public ZerodhaLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void sendUserID()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userid']")));
	    UserID.sendKeys("DV1510");
	    
	 /*   String maxLength = UserID.getAttribute("value");
	    int length = maxLength.length();
	    if(length==6)
	    {
	    	System.out.println("User id length is 6 Test case is pass");
	    }
	    else
	    {
	    	//Verify that User Id should not accept  more than or less than  6 characters
	    	System.out.println("User id length is not 6 Test case is fail");
	    } */
	}
	
	public void sendPassword()
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));	
	Password.sendKeys("Goal@123");
/*	String Pass = Password.getAttribute("value");
	int length1 = Pass.length();
	if(length1>=8)
	{
		//Verify that Password should  accept  more than 8 characters  with special symbol and digits
		System.out.println("Password length is  greater than 8 character Test case is Pass");
	}
	else
	{
		System.out.println("Password length not greather than 8 character Test case is fail");
	} */
	
	}
	
	public void clickLoginbtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-orange wide']")));
		Loginbtn.click();
	}
	
	public void sendPIN()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pin']")));
		pin.sendKeys("959594");
		
		String Pin1 = pin.getAttribute("value");
		int length1 = Pin1.length();
		if(length1==6)
		{
			//Verify that Password should  accept  more than 8 characters  with special symbol and digits
			System.out.println("Pin length is 6 digit Test case is Pass");
		}
		else
		{
			System.out.println("Pin length not 6 digit Test case is fail");
		}
	}
	
	public void clickOnContinuebtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-orange wide']")));
		continuebtn.click();
	}
	
}
