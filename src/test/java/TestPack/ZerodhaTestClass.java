package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PomPack.ZerodhaBuyandsell;
import PomPack.ZerodhaHomepage;
import PomPack.ZerodhaInvalidLogin;
import PomPack.ZerodhaLogin;
import PomPack.ZerodhaOpenchart;
import basePackage.Pojo;

public class ZerodhaTestClass extends Pojo {
WebDriver driver;
	
	@BeforeClass //TCZE1,TCZE2
	public void beforeClass()
	{
		driver = openChromeBrowser("https://kite.zerodha.com");
	 /*   String title=driver.getCurrentUrl();
	    if(title.contains("https://kite.zerodha.com/"))
	    {
	    	System.out.println("URL is matched Test case is pass");
	    }
	    else
	    {
	    	System.out.println("URL does not match Test case is fail");
	    } */
	}
	
	@Test  //TCZE3,TCZE4,TCZE8,TCZE9
	public void Login()
	{
	/*	String title=driver.getCurrentUrl();
	    if(title.contains("https://kite.zerodha.com/"))
	    {
	    	System.out.println("Login page is displayed Test case is pass");
	    }
	    else
	    {
	    	System.out.println("Login page is not displayed Test case is fail");
	    } */
	    
		ZerodhaLogin login = new ZerodhaLogin(driver);
		login.sendUserID();	
		login.sendPassword();
		login.clickLoginbtn();
		login.sendPIN();
		login.clickOnContinuebtn();
		System.out.println("Login is successfully");
		
	}
	
	@Test (enabled=false)//TCZE5,TCZE6,TCZE7,
	public void InvalidLogin()
	{
		ZerodhaInvalidLogin login = new ZerodhaInvalidLogin(driver);
		login.sendUserID();
		login.sendPassword();
		login.clickLoginbtn();
		System.out.println("Login is unsucessfully");
	}
	
	@Test  
	public void homePage()
	{
		ZerodhaHomepage homepage = new ZerodhaHomepage(driver);
		homepage.clickDashbord();
		homepage.clickOrders();
		homepage.clickHoldings();
		homepage.clickPositions();
		homepage.clickFunds();
		homepage.clickApps();
	//	homepage.clickAvatar();
	//	homepage.clickDV1510();
	} 
	
	@Test (enabled=false)
	public void openChart()
	{
		ZerodhaOpenchart openchart = new ZerodhaOpenchart(driver);
	//	openchart.clickNifty50();
		openchart.clickSENSEX();
		openchart.sendSearch();
	}
	
	@Test (enabled=false)
	public void buyAndSell()
	{
		ZerodhaBuyandsell buyandsell = new ZerodhaBuyandsell(driver);
		buyandsell.Select();
		buyandsell.clickBuy();
	//	buyandsell.selectBSE();
		buyandsell.selectNSE();
	//	buyandsell.clickRegular();
		buyandsell.clickCover();
	//	buyandsell.clickAMO();
	//	buyandsell.clickIceberg();
	//	buyandsell.selectIntraday();
		buyandsell.selectLongterm();
		buyandsell.mousehoverQty();
		buyandsell.mousehoverPrice();
		buyandsell.mousehoverTriggerPrice();
		buyandsell.selectMarket();
		buyandsell.selectLimit();
		buyandsell.selectSL();
		buyandsell.selectSL_M();
		buyandsell.clickMoreOptions();
		buyandsell.selectDay();
		buyandsell.selectImmediate();
		buyandsell.selectMinutes();
	//	buyandsell.selectValidityMinutes();
		buyandsell.clickBuysubmit();
		buyandsell.clickCancel();
	}
	
	
/*	@Test
	public void ForgotPass()
	{
		ZerodhaForgotPass forgot = new ZerodhaForgotPass(driver);
		forgot.forgotPass();
		forgot.forgotRadiobtn();
		forgot.forgotRadiobtn1();
	} */
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
     
}
