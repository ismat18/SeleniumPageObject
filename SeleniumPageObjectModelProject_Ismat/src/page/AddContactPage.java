package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
WebDriver driver;
	
	public AddContactPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="account")
	WebElement fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement companyname;
	
	@FindBy(how=How.ID, using="email")
	WebElement email1;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement cityname;
	
	@FindBy(how=How.ID,using="state")
	WebElement statename;
	
	@FindBy(how=How.ID,using="zip")
	WebElement zip ;
	
	//@FindBy(how=How.ID, using="select2-country-container")
	//WebElement country;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit_button;
		
	
	public void AddContact_demo(){
				
		fullname.sendKeys("Ismat Jahan");
		companyname.sendKeys("abc");
		email1.sendKeys("jahan.ismat@gmail.com");
		phone.sendKeys("12345678");
		address.sendKeys("123 Irving Blvd");
		cityname.sendKeys("Irving");
		statename.sendKeys("TX");
		zip.sendKeys("75060");
		//country.sendKeys("unitedstate");
		submit_button.click();
			
	}

}
