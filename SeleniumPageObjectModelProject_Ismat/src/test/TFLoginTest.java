package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.TFLoginPage;
import util.BrowserFactory;

public class TFLoginTest {

	@Test
	public void loginTest() throws IOException, InterruptedException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
					
			
	TFLoginPage loginPage = PageFactory.initElements(driver, TFLoginPage.class);
			
				
	loginPage.login_demo();

	driver.close();

	driver.quit();
				
		
	}
}
