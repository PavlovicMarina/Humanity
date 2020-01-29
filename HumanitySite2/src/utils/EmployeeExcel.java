package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.StaffPage;
import pages.TitlePage;

public class EmployeeExcel extends BasicTest {

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
	public void Staff() throws InterruptedException, IOException {

		MenuPage mp = new MenuPage(driver);
		mp.clickStaff();
		Thread.sleep(1000);

		StaffPage sp = new StaffPage(driver);
		sp.ClickAddStafBtn();
		Thread.sleep(1000);

		File file = new File("radnici.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Ime = sheet.getRow(1).getCell(0).getStringCellValue();
		String Prezime = sheet.getRow(1).getCell(1).getStringCellValue();
		String Email = sheet.getRow(1).getCell(2).getStringCellValue();

		sp.ForExcelStaff1(Ime, Prezime, Email);
		Thread.sleep(2000);
		wb.close();

		Assert.assertTrue(sp.Employee1Added());

	}

	@Test(priority = 10)
	public void Staff2() throws InterruptedException, IOException {

		File file = new File("radnici.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Ime = sheet.getRow(2).getCell(0).getStringCellValue();
		String Prezime = sheet.getRow(2).getCell(1).getStringCellValue();
		String Email = sheet.getRow(2).getCell(2).getStringCellValue();

		StaffPage sp = new StaffPage(driver);
		sp.ForExcelStaff2(Ime, Prezime, Email);
		Thread.sleep(2000);
		wb.close();

		Assert.assertTrue(sp.Employee2Added());

	}

}
