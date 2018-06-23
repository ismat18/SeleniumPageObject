package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TFHomePage {
	WebDriver driver;

	public TFHomePage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;

	@FindBy(how = How.XPATH, using = "//span[text()='Welcome TechFios Tester']")
	WebElement Welcome;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text'][@placeholder='Search Customers...']")
	WebElement Search;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Income Today')]")
	WebElement Incometoday;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expense Today')]")
	WebElement Expensetoday;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Income This Month')]")
	WebElement Incomethismonth;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expense This Month')]")
	WebElement Expensethismonth;

	@FindBy(how = How.XPATH, using = "//*[@class=' c3-event-rect c3-event-rect-7']")
	WebElement IncomeExpenseGraph;

	@FindBy(how = How.XPATH, using = "//h5[text()='Net Worth & Account Balances']")
	WebElement NetworthAccountBalance;

	@FindBy(how = How.XPATH, using = "//h5[text()='Income vs Expense - June 2018']")
	WebElement IncomeVsExpense;

	@FindBy(how = How.XPATH, using = "//h5[text()='Latest Income']")
	WebElement Latestincome;

	// @FindBy(how = How.XPATH, using = "//h5[text()='Latest Expense']]")
	@FindBy(how = How.XPATH, using = "//text()[contains(.,'Latest Expense')]/ancestor::div[1]")
	WebElement Latestexpense;

	public void CRM_Click() {

		CRM.click();
		AddContact.click();

	}

	public void Validate_User() {

		if (Welcome.isDisplayed()) {
			System.out.println("Login into home page");
		}
	}
	
	public void Validate_Search() {

		if (Search.isDisplayed()) {
			System.out.println("Search textbox displayed");
		}
	}

	public void Validate_IncomeExpense_Graph() {

		if (Incometoday.isDisplayed() && (Expensetoday.isDisplayed()) && (Incomethismonth.isDisplayed())) {
			System.out.println("Income Today, Expense Today, Income This Month, and Expense This Month displayed successfully");
		}
	}

	public void Validate_NetworthAndExpenseBalance() {
		if (Expensethismonth.isDisplayed() && (IncomeExpenseGraph.isDisplayed())) {
			System.out.println("Expense This Month and Graph Of Income and Expense displayed successfully");

		}

		if (NetworthAccountBalance.isDisplayed() && (IncomeVsExpense.isDisplayed())) {
			System.out.println("Networth Account Balance and Income VS Expense displayed successfully");

		}

	}

	public void Validate_LatestIncome_LatestExpense() {
		if (Latestincome.isDisplayed() && (IncomeVsExpense.isDisplayed())) {
			System.out.println("Latest Income and Latest Expense displayed successfully");

		}

	}

}


