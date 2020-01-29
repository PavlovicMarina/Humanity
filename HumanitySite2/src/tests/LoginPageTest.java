package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.TitlePage;

public class LoginPageTest extends BasicTest {
	
private String baseUrl = "https://www.humanity.com/";
	

	@Test
	public void basicLogin() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		HomePage hhp = new HomePage(driver);
		hhp.GoLogin();
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(driver);
		lp.LogIn();
		Thread.sleep(2000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard - Dashboard - Humanity");
		
	}

}
