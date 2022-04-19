package ltm_testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ltm_Pages.LTMLogin_Page;
import ltm_Utility.Xls_Reader;

public class LTMLogin extends LTM_Baseclass 
{

	LTMLogin_Page loginpage;
	
	public void login() throws InterruptedException, IOException 
	{

		Xls_Reader ob1 = new Xls_Reader(Project_path + "\\Testdata\\LTMTestdata.xlsx");
		
		loginpage = PageFactory.initElements(d, LTMLogin_Page.class);

		int lastrow = ob1.getRowCount("CD");

		System.out.println("Login Process start");
	
		for (int j = 0; j < lastrow; j++) {
			
			loginpage.LTMUsername().sendKeys(ob1.getcelldatastring("CD", j, 0));
			
			loginpage.LTMPassword().sendKeys(ob1.getcelldatastring("CD", j, 1));
			
			loginpage.clickOnLoginButton();
			{
			if(loginpage.lblFailureText().isDisplayed())
			{
				System.out.println("Invalid Username and Password");
				loginpage.lblFailureText_closebutton().click();
				loginpage.LTMUsername().clear();
				loginpage.LTMPassword().clear();
			}
			else 
			{
				Assert.assertEquals(d.getTitle(), "LENOVO LTM");
				
				System.out.println("Login Pass");
				
			}
			}
	
	}

		
		}
}