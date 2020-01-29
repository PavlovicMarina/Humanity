package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import pages.TitlePage;

public class HomePageTest extends BasicTest{
	
private String baseUrl = "https://www.humanity.com/";
	

	@Test
	public void HomePage() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.ClickAboutUs();
		Thread.sleep(1000);
		hp.ClickAboutUs2();
		Thread.sleep(1000);  
		
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "About Humanity");
		
	}
		
		@Test (priority = 1)
		public void basicLogin() throws InterruptedException {
			
		
		HomePage hp = new HomePage(driver);
		hp.SetName();
		Thread.sleep(500);
		hp.SetMail();
		Thread.sleep(500);
		hp.freeTrial();
		
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard - Dashboard - Humanity");
		
		
		
		
		
		
	}
	
	
	

}
