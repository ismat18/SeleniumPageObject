package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMPage {

WebDriver driver;
	
	public CRMPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how = How.XPATH, using = "//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;
	
     public void CRM_click(){
		
		CRM.click();
		AddContact.click();
	}


   /*public void validatehomepage(){
    	
	  if (driver.findElement(By.id("account")).isDisplayed())
	  
	  {
		  System.out.println("You can add new contact now!");
		  
	  }
   }*/
}
