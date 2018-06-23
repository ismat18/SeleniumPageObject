package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddContactPage;
import page.CRMPage;
import page.TFLoginPage;
import util.BrowserFactory;

public class AddContactTest {
	@Test
	public void AddContactTest() throws IOException, InterruptedException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
	
	TFLoginPage Loginpage = PageFactory.initElements(driver, TFLoginPage.class);
	Loginpage.login_demo();
	System.out.println ("login Sucessfully");
	
	
	CRMPage TFCrmPage = PageFactory.initElements(driver, CRMPage.class);			
	TFCrmPage.CRM_click();
	System.out.println ("ready to add contact");
	
	AddContactPage AddContact=PageFactory.initElements(driver, AddContactPage.class);
	AddContact.AddContact_demo();
	System.out.println ("A New contact added");
	

	driver.close();

	driver.quit();
				
		
	}
	
}
