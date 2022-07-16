package PomPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaInvalidLogin {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UserID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[@class='button-orange wide']")
	private WebElement Loginbtn;
	
	public ZerodhaInvalidLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void sendUserID()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userid']")));
		UserID.sendKeys("DV1510");	
	}
	
	public void sendPassword()
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));	
	Password.sendKeys("Goal@12345");
	}
	
	public void clickLoginbtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-orange wide']")));
		Loginbtn.click();
	}
	
}
