/**
 * 
 */
package testproject.qa;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;


public class TestListener implements ITestListener {
public static int scriptExeCount, passCount, failCount, skipCount=0;

	
	public void onTestStart(ITestResult result) {
		
		scriptExeCount++;
		Reporter.log(result.getName()+"script execution starts"+new Date(), true);
	}

	
	public void onTestSuccess(ITestResult result) {
		
		passCount++;
		Reporter.log(result.getName()+"script is passed:)", true);
	}

	
	public void onTestFailure(ITestResult result) {
		failCount++;
		Reporter.log(result.getName()+"script failed", true);
		
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot"+result.getName()+".png");
		try
		{
			Files.copy(srcFile, destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}

	
	public void onTestSkipped(ITestResult result) {
		
		skipCount++;
		Reporter.log(result.getName()+"script skipped :(", true);
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		Reporter.log("Suite Execution starts"+new Date(),true);
		
	}

	
	public void onFinish(ITestContext context) 
	{
		Reporter.log("Suite Execution ends"+new Date(), true);
		Reporter.log("Total Script Executed: "+ scriptExeCount,true);
		Reporter.log("Total Script Passed:"+passCount, true);
		Reporter.log("Total Script Failed:"+ failCount, true);
		Reporter.log("Total Script Skipped:"+skipCount, true);
	}

	

	

}  