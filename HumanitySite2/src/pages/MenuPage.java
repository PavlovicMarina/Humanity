package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasicPage {

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	private By Dashboard = By.id("sn_dashboard");
	private By Planning = By.id("sn_schedule");
	private By Time = By.id("sn_timeclock");
	private By Leave = By.id("sn_requests");
	private By Traning = By.id("sn_training");
	private By Staff = By.id("sn_staff");
	private By Payroll = By.id("sn_payroll");
	private By Reports = By.id("sn_reports");

	public WebElement getDashboard() {
		return this.driver.findElement(Dashboard);
	}

	public WebElement getPlanning() {
		return this.driver.findElement(Planning);
	}

	public WebElement getTime() {
		return this.driver.findElement(Time);
	}

	public WebElement getRequests() {
		return this.driver.findElement(Leave);
	}

	public WebElement getTraning() {
		return this.driver.findElement(Traning);
	}

	public WebElement getStaff() {
		return this.driver.findElement(Staff);
	}

	public WebElement getPayroll() {
		return this.driver.findElement(Payroll);
	}

	public WebElement getReports() {
		return this.driver.findElement(Reports);
	}

	public void clickDashboard() {
		this.driver.findElement(Dashboard).click();
	}

	public void clickPlanning() {
		this.driver.findElement(Planning).click();
	}

	public void clickTime() {
		this.driver.findElement(Time).click();
	}

	public void clickLeave() {
		this.driver.findElement(Leave).click();
	}

	public void clickTraning() {
		this.driver.findElement(Traning).click();
	}

	public void clickStaff() {
		this.driver.findElement(Staff).click();
	}

	public void clickPayroll() {
		this.driver.findElement(Payroll).click();
	}

	public void clickReports() {
		this.driver.findElement(Reports).click();
	}

}
