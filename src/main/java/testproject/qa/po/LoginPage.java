package testproject.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class LoginPage extends BasePage{
	
	
	@FindBy(id = "user_email")
	private WebElement emailTxtbox;
	
	@FindBy(id = "user_password")
	private WebElement passTxtbox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;
	

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void enterUserName(String str)
	{
		emailTxtbox.sendKeys(str);
		Reporter.log("<br>enterUseremail", true);
	}
	
	public void enterPassword(String str)
	{
		passTxtbox.sendKeys(str);
		Reporter.log("<br>enterPassword", true);
	}
	
	public DashboardPage clickLoginBtn() {
		loginBtn.click();
		Reporter.log("<br>clickLoginBtn", true);
		return new DashboardPage(driver);
	}
	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
