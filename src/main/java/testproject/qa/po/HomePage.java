package testproject.qa.po;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import testproject.qa.utils.WaitTime;

public class HomePage extends BasePage {
    private WebDriver driver;
    
    @FindBy(xpath = "(//a/span[contains(.,'Login')])[1]")
	private WebElement loginBtn;
    
    
    
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

    public LoginPage clickLoginBtn() {
    	loginBtn.click();
		Reporter.log("<br>clickLoginBtn::" , true);
		return new LoginPage(driver);
    }
	


	@Override
	public HomePage waitForPage() {
		// TODO Auto-generated method stub
		return this;
	}


	

}
