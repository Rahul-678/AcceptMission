package testproject.qa;


import org.testng.Assert;
import org.testng.annotations.Test;

import testproject.qa.po.DashboardPage;
import testproject.qa.po.HomePage;
import testproject.qa.po.LoginPage;
import testproject.qa.po.Signup_Page;


public class SmokeTest extends BaseTest{
	private HomePage homePage;
	private DashboardPage dashboardPage;
	private LoginPage loginPage;
	private Signup_Page SignupPage;
	
	
	@Test(priority=0)
	public void verify_Login() throws Exception{
		driver.get("https://acceptmission.com");
		homePage = new HomePage(driver);
		loginPage = homePage.clickLoginBtn();
		
		loginPage.enterUserName("testlabel123456+999@gmail.com");
		loginPage.enterPassword("Test@123");
		Thread.sleep(1000);
		dashboardPage =loginPage.clickLoginBtn();
		 String title= driver.getTitle();
		    System.out.println("This page title is   "+ title);
		Assert.assertEquals(dashboardPage.getPageTitle(),"DASHBOARD");
		driver.close();
	}
	//@Test(priority=1)
	public void verify_Signup() throws InterruptedException {
		driver.get("https://acceptmission.com");
		
		SignupPage = new Signup_Page(driver);
		SignupPage.enterEmail();
		SignupPage.clickOnSignUpFreeBtn();
		SignupPage.enterFirstName();
		SignupPage.enterLastName();
		SignupPage.enterPhoneNumber();
		SignupPage.enterComapnyName();
		SignupPage.ClickOnSignUp_Btn();
//		Thread.sleep(2000);
//		SignupPage.closePopup();
//		
//		SignupPage.verify_SignUp_Page();
//		 String title= driver.getTitle();
//		    System.out.println(title);
//		Assert.assertEquals(dashboardPage.getPageTitle(),"DASHBOARD");
		driver.close();
		
	}
	@Override
	public void afterTest() {
		// TODO Auto-generated method stub
		
	}
	
}
