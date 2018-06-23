package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TFLoginPage {
WebDriver driver;
	
	public TFLoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement submit_button;
	
	
	
	
	public void login_demo() throws InterruptedException{
		
		username.sendKeys("techfiosdemo@gmail.com");
		password.sendKeys("abc123");
		Thread.sleep(3000);
		submit_button.click();
	}
	
    
}
