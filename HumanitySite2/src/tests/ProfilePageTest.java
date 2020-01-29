package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.TitlePage;

public class ProfilePageTest extends BasicTest {

	private String baseUrl = "https://www.humanity.com/";

	@Test
	public void BasicLogin() throws InterruptedException {
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

	@Test(priority = 1)
	public void Profile1() throws InterruptedException {

		ProfilePage pp = new ProfilePage(driver);
		pp.ClickIconArrow();
		Thread.sleep(1000);
		pp.ClickProfile();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - Overview - Humanity");

	}

	@Test(priority = 2)
	public void Settings() throws InterruptedException {

		ProfilePage pp = new ProfilePage(driver);
		pp.ClickIconArrow();
		Thread.sleep(1000);
		pp.ClickSettings();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - New User - Humanity");
	}

	@Test(priority = 3)
	public void Availability() throws InterruptedException {

		ProfilePage pp = new ProfilePage(driver);
		pp.ClickIconArrow();
		Thread.sleep(1000);
		pp.ClickAvailability();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - Availability - Humanity");
	}

	@Test(priority = 4)
	public void LogOut() throws InterruptedException {

		ProfilePage pp = new ProfilePage(driver);
		pp.ClickIconArrow();
		Thread.sleep(1000);
		pp.ClickLogout();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Online Employee Scheduling Software | Workforce Management");
	}
}
