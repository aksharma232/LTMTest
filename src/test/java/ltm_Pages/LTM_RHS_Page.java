package ltm_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LTM_RHS_Page
{
	@FindBy(how=How.XPATH, using= "//div[@id='btnExpandMenu']") 
	WebElement RHSExpandMenu;
	
	@FindBy(how=How.XPATH, using="(//label[text()=\"Upgrade Management\"])[2]")
  	WebElement UpgradeManagement;
	
	@FindBy(how=How.XPATH, using="(//label[text()='Software Upgrade Management'])[2]")
  	WebElement Software_Upgrade_Management;
	
	@FindBy(how=How.XPATH, using="(//label[text()='Software Upgrade'])[2]")
  	WebElement Software_Upgrade;
	
	@FindBy(how=How.XPATH, using= "(//a[text()='System Settings'])[2]") 
	WebElement System_Settings;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Date and Time']")
	WebElement Date_and_Time;
	

	@FindBy(how=How.XPATH, using="//a[text()='Date & Time Setup']")
	WebElement Date_and_Time_Setup;
	
	@FindBy(how=How.XPATH, using="(//label[text()='Connection Management'])[4]")
	WebElement ConnectionManagement;
	
	@FindBy(how=How.XPATH, using="(//label[@title='Connections'][text()='Connections'])[4]")
	WebElement Connection;
	
	
	public WebElement ClickonRHSMenu()
	{
		return RHSExpandMenu;
	}

	public WebElement UpgradeManagement()
	{
		return UpgradeManagement;
	}

	public WebElement Software_Upgrade_Management()
	{
		return Software_Upgrade_Management;
	}

	public WebElement Software_Upgrade()
	{
		return Software_Upgrade;
	}

	public WebElement Connection_Management()
	{
		return ConnectionManagement;
		
	}

	public WebElement Connection()
	{
		return Connection;
		
	}

	public WebElement Date_and_Time()
	{
		return Date_and_Time;
		
	}
	
	public WebElement Date_Time_Setup()
	{
		return Date_and_Time_Setup;
		
	}
	
	public WebElement System_Settings()
	{
		return System_Settings;
		
	}
}




