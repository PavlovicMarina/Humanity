package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.StaffPage;
import pages.TitlePage;

public class StaffPageTest extends BasicTest {
	
	
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
		Thread.sleep(3000);
		
		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard - Dashboard - Humanity");
		
	}
	
	
	@Test (priority = 5)
	public void AddingStaff1() throws InterruptedException {
		
		MenuPage mp = new MenuPage(driver);
		mp.clickStaff();
		Thread.sleep(1000);
		
		StaffPage sp = new StaffPage(driver);
		sp.ClickAddStafBtn();
		Thread.sleep(1000);
		sp.AddEmployee1();
		Thread.sleep(500);
		
		Assert.assertTrue(sp.Employee1Added()); 
		}
		
		@Test (priority = 6)
		public void AddingStaff2() throws InterruptedException {
		
		StaffPage sp = new StaffPage(driver);
		sp.AddEmployee2();
		Thread.sleep(500);
		sp.ClickSave();
		
		Assert.assertTrue(sp.Employee2Added()); 
}
	}
