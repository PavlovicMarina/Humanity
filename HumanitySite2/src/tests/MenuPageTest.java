package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.TitlePage;

public class MenuPageTest extends BasicTest {

	private String baseUrl = "https://www.humanity.com/";

	@Test(priority = 0)
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

	@Test(priority = 5)
	public void Dashboard() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickDashboard();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard - Dashboard - Humanity");

	}

	@Test(priority = 6)
	public void Planning() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickPlanning();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "ShiftPlanning - Humanity");

	}

	@Test(priority = 7)
	public void Time() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickTime();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Timeclock - Overview - Humanity");

	}

	@Test(priority = 8)
	public void Leave() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickLeave();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Leave - Vacation - Humanity");

	}

	@Test(priority = 9)
	public void Training() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickTraning();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Training - Overview - Humanity");
	}

	@Test(priority = 10)
	public void Staff() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickStaff();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - List - Humanity");
	}

	@Test(priority = 11)
	public void Payroll() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickPayroll();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Payroll - Scheduled-hours - Humanity");
	}

	@Test(priority = 12)
	public void Reports() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickReports();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Reports - Reports Home - Humanity");
	}

}
