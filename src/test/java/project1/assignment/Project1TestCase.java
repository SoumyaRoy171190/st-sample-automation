package project1.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import project1.reusableUtils.Constants;
import reusablePageFactory.PhPLoginPage;
/**
 * @author SoumyaRoy
 * Simple Login Page Test Case for reference
 * TestNG is used 
 * PageFactory initialization method is called as Page Object Model scenario implementation
 */

public class Project1TestCase {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = -9999)
	public void openBrowser() {
		driver.get(Constants.travelsUrl);
	}

	@Test(priority = 0)
	public void loginToPhP() {

		PhPLoginPage login_Page = PageFactory.initElements(driver, PhPLoginPage.class);
		login_Page.loginPhpTraverls(Constants.userName, Constants.password);
	}

}
