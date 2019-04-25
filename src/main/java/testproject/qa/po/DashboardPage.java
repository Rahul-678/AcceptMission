package testproject.qa.po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends BasePage{
	
	
	@FindBy(xpath = "//h1")
	private WebElement pageTitle;
	
	
	@FindBy(xpath = "(//a[@href= 'https://www.travelocity.com/'])")
	private WebElement searchResultLink;
	
	
	
	
	
	private WebDriver driver;
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage selectTargetDestination() {
		searchResultLink.click();
		Reporter.log("<br>selectTargetDestination::" , true);
		return new HomePage(driver);
	}
	
	public String getPageTitle() {
		String res = pageTitle.getText();
		Reporter.log("<br>selectTargetDestination::" , true);
		return res;
	}
	
	
	

	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
