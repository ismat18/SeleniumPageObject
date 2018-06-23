
	package test;

	import java.io.IOException;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	import page.CRMPage;
	import page.TFLoginPage;
	import util.BrowserFactory;

	public class CRMTest {

		
		@Test
		public void CRMTest() throws IOException, InterruptedException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
		
		TFLoginPage Loginpage = PageFactory.initElements(driver, TFLoginPage.class);
		Loginpage.login_demo();
		System.out.println ("login Sucessfully");
		
		
		CRMPage TFCrmPage = PageFactory.initElements(driver, CRMPage.class);			
		TFCrmPage.CRM_click();
		System.out.println ("ready to add contact");	
		
		

		driver.close();

		driver.quit();
					
			
		}
		
}
