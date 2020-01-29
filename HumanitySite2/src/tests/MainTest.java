package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.EditStaffPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ProfilePage;
import pages.StaffPage;
import pages.TitlePage;

public class MainTest extends BasicTest {
	
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

	@Test(priority = 5)
	public void Dashboard() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickDashboard();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Dashboard - Dashboard - Humanity");

	}

	@Test(priority = 6)
	public void Planning() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickPlanning();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "ShiftPlanning - Humanity");

	}

	@Test(priority = 7)
	public void Time() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickTime();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Timeclock - Overview - Humanity");

	}

	@Test(priority = 8)
	public void Leave() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickLeave();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Leave - Vacation - Humanity");

	}

	@Test(priority = 9)
	public void Training() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickTraning();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Training - Overview - Humanity");
	}

	@Test(priority = 10)
	public void Staff() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickStaff();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - List - Humanity");
	}

	@Test(priority = 11)
	public void Payroll() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickPayroll();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Payroll - Scheduled-hours - Humanity");
	}

	@Test(priority = 12)
	public void Reports() throws InterruptedException {

		MenuPage mp = new MenuPage(driver);
		mp.clickReports();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Reports - Reports Home - Humanity");
	}
	@Test (priority = 13)
	public void AddingStaff1() throws InterruptedException {
		
		MenuPage mp = new MenuPage(driver);
		mp.clickStaff();
		Thread.sleep(1000);
		
		StaffPage sp = new StaffPage(driver);
		sp.ClickAddStafBtn();
		Thread.sleep(1000);
		sp.AddEmployee1();
		Thread.sleep(2000);
		
		Assert.assertTrue(sp.Employee1Added()); 
		}
		
		@Test (priority = 14)
		public void AddingStaff2() throws InterruptedException {
		
		StaffPage sp = new StaffPage(driver);
		sp.AddEmployee2();
		Thread.sleep(1000);
		sp.ClickSave();
		
		Assert.assertTrue(sp.Employee2Added()); 
}
		@Test(priority = 15)
		public void Profile() throws InterruptedException {

			ProfilePage pp = new ProfilePage(driver);
			pp.ClickIconArrow();
			Thread.sleep(1000);
			pp.ClickProfile();
			Thread.sleep(1000);

			TitlePage tp = new TitlePage(driver);
			Assert.assertEquals(tp.getPageTitle(), "Staff - Overview - Humanity");

		}

		@Test(priority = 16)
		public void EditProfile() throws InterruptedException {

			EditStaffPage esp = new EditStaffPage(driver);
			esp.ClickEditDetails();
			Thread.sleep(2000);
			esp.UploadPicture("Images\\Picture.jpg");
			Thread.sleep(6000);

			Assert.assertEquals(esp.ImageUploadedSuccessfuly(), true);

		}

		@Test(priority = 17)
		public void EditProfile2() throws InterruptedException {

			EditStaffPage esp = new EditStaffPage(driver);
			esp.NickName();
			Thread.sleep(3000);
			esp.ClickSave();

			Assert.assertEquals(esp.NickNameChanged(), true);

		}

		@Test(priority = 19)
		public void Settings() throws InterruptedException {

			ProfilePage pp = new ProfilePage(driver);
			pp.ClickIconArrow();
			Thread.sleep(1000);
			pp.ClickSettings();
			Thread.sleep(2000);

			TitlePage tp = new TitlePage(driver);
			Assert.assertEquals(tp.getPageTitle(), "Staff - New User - Humanity");
		}

		@Test(priority = 20)
		public void Availability() throws InterruptedException {

			ProfilePage pp = new ProfilePage(driver);
			pp.ClickIconArrow();
			Thread.sleep(1000);
			pp.ClickAvailability();
			Thread.sleep(3000);

			TitlePage tp = new TitlePage(driver);
			Assert.assertEquals(tp.getPageTitle(), "Staff - Availability - Humanity");
		}

		@Test(priority = 21)
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
