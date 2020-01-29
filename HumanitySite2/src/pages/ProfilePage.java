package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasicPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	private By iconArrow = By.cssSelector("#wrap_us_menu > i");
	private By profile = By.cssSelector("#userm > div > a:nth-child(3)");
	private By settings = By.cssSelector("#userm > div > a:nth-child(5)");
	private By availability = By.cssSelector("#userm > div > a:nth-child(7)");
	private By logout = By.cssSelector("#userm > div > div:nth-child(13) > a");
	
	public WebElement geticonArrow() {
		return this.driver.findElement(iconArrow);
	}
	
	public WebElement getprofile() {
		return this.driver.findElement(profile);
	}
	
	public WebElement getsettings() {
		return this.driver.findElement(settings);
	}
	public WebElement getavailability() {
		return this.driver.findElement(availability);
	}
	public WebElement getlogout() {
		return this.driver.findElement(logout);
	}
	
	public void ClickIconArrow() {
		this.driver.findElement(iconArrow).click();
	}
	public void ClickProfile() {
		this.driver.findElement(profile).click();
	}
	public void ClickSettings() {
		this.driver.findElement(settings).click();
	}
	public void ClickAvailability() {
		this.driver.findElement(availability).click();
	}
	public void ClickLogout() {
		this.driver.findElement(logout).click();
	}
	
	

}
