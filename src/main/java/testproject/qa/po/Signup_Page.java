package testproject.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Signup_Page extends BasePage{

	@FindBy(xpath = "(//a[contains(@class,'fusion-button button-flat fusion-button')])[1]")
	private WebElement Get_Started_Now;
	@FindBy(xpath = "//input[@placeholder='EMAIL ADDRESS']")
	private WebElement enter_Email;
	@FindBy(xpath = "//span[text()='SIGN UP FREE']")
	private WebElement Sign_Up_Free;
	@FindBy(xpath = "//input[@name='user[first_name]']")
	private WebElement First_Name;
	@FindBy(xpath = "//input[@id='user_last_name']")
	private WebElement Last_Name;
	@FindBy(xpath = "//input[@id='user_phone_number']")
	private WebElement Phone_Number;
	@FindBy(xpath = "//input[@id='company_name']")
	private WebElement  Company_Name;
	@FindBy(name = "commit")
	private WebElement  SignUp;
	@FindBy(xpath = "//a[@class='appcues-button appcues-button-success']")
	private WebElement  ClosePopup;
	@FindBy(id="user_password")
	private WebElement setPassword;
	@FindBy(id="user_password_confirmation")
	private WebElement setConfirmPassword;
	
	//a[@class='appcues-button appcues-button-success']
	
	
	
	
	public Signup_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void clickOn_GetStartedNow_Btn() {
//		Get_Started_Now.click();
//		Reporter.log("<br>clickLoginBtn", true);
//	}
	public void enterEmail() {
		long millis = System.currentTimeMillis() % 1000;
	       String  	strUserEmail="acm"+ millis+"@yopmail.com";
	       enter_Email.sendKeys(strUserEmail);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void clickOnSignUpFreeBtn() {
		Sign_Up_Free.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterFirstName() {
		First_Name.sendKeys("First");
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterLastName() {
		Last_Name.sendKeys("Last");;
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterPhoneNumber() {
		Phone_Number.sendKeys("1234567890");;
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterComapnyName() {
		Company_Name.sendKeys("TestQA");
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void ClickOnSignUp_Btn() {
		SignUp.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void closePopup() {
		ClosePopup.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterPassword() {
		setPassword.sendKeys("123Test");
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterConfirmPassword() {
		setConfirmPassword.sendKeys("123Test");
		Reporter.log("<br>clickLoginBtn", true);
	}
	
	public void verify_SignUp_Page() throws InterruptedException {
		//clickOn_GetStartedNow_Btn();
		enterEmail();
		clickOnSignUpFreeBtn();
		enterFirstName();
		enterLastName();
		enterPhoneNumber();
		enterComapnyName();
		//enterPassword();
		//enterConfirmPassword();
		ClickOnSignUp_Btn();
		
		Thread.sleep(500);
		//closePopup();
	}
	

	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
