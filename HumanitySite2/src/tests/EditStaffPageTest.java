package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.EditStaffPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.TitlePage;

public class EditStaffPageTest extends BasicTest {

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

	@Test(priority = 1)
	public void Profile() throws InterruptedException {

		ProfilePage pp = new ProfilePage(driver);
		pp.ClickIconArrow();
		Thread.sleep(1000);
		pp.ClickProfile();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertEquals(tp.getPageTitle(), "Staff - Overview - Humanity");

	}

	@Test(priority = 2)
	public void EditProfile() throws InterruptedException {

		EditStaffPage esp = new EditStaffPage(driver);
		esp.ClickEditDetails();
		Thread.sleep(2000);
		esp.UploadPicture("Images\\Picture.jpg");
		Thread.sleep(6000);

		Assert.assertEquals(esp.ImageUploadedSuccessfuly(), true);

	}

	@Test(priority = 3)
	public void EditProfile2() throws InterruptedException {

		EditStaffPage esp = new EditStaffPage(driver);
		esp.NickName();
		Thread.sleep(3000);
		esp.ClickSave();

		Assert.assertEquals(esp.NickNameChanged(), true);

	}

}
