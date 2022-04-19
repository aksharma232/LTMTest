package ltm_testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ltm_Pages.LTM_Connectionpage;
import ltm_Pages.LTM_DateTime;
import ltm_Pages.LTM_Patchupgrade;
import ltm_Pages.LTM_RHS_Page;

public class LTM_DateTime_Test extends LTM_Baseclass
{
	LTMLogin ltmlogin;
	LTM_RHS_Page ltmrhs;
	LTM_DateTime DateTime;
	LTM_Connectionpage Connectionpage;
	
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		Launchbrowser();
		log.info("launching chrome broswer");
		ltmlogin = new LTMLogin();
		ltmlogin.login();
	}

	@Test
	public void DateTime() throws IOException, InterruptedException 
	{
		ltmrhs = PageFactory.initElements(d, LTM_RHS_Page.class);
		DateTime = PageFactory.initElements(d, LTM_DateTime.class);
		
		LTM_LHSOptions LHS = new LTM_LHSOptions();
		
		LHS.LTM_LHSTC();
		
		//Thread.sleep(2000);
		
		Actions RHS = new Actions(d);
		
		RHS.moveToElement(ltmrhs.ClickonRHSMenu()).click().build().perform();
		
		Thread.sleep(2000);
			
		ltmrhs.System_Settings().click();
		
		ltmrhs.Date_and_Time().click();
		
		ltmrhs.Date_Time_Setup().click();
	
		Thread.sleep(3000);

		DateTime.ManualDate().click();
	}

}









