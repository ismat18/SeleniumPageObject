package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TFHomePage;
import page.TFLoginPage;
import util.BrowserFactory;

public class TFHomeTest{
	
	@Test
	public void TFHomeTest() throws IOException, InterruptedException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
					
			
	TFLoginPage loginPage = PageFactory.initElements(driver, TFLoginPage.class);
	loginPage.login_demo();
	
	TFHomePage homePage = PageFactory.initElements(driver, TFHomePage.class);
	homePage.Validate_User();
	homePage.Validate_Search();
	homePage.Validate_IncomeExpense_Graph();
	homePage.Validate_NetworthAndExpenseBalance();
	homePage.Validate_LatestIncome_LatestExpense();
	
	
	try{
		Thread.sleep(3000);
	}catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	driver.close();

	driver.quit();
				
		
	}

}
