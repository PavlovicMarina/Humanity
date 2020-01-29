package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasicPage {

	
	private By Login = By.cssSelector("#navbarSupportedContent > div > a:nth-child(3) > p");
	private By Name = By.name("fullname");
	private By Email = By.name("workemail");
	private By ButtonDown = By.cssSelector("div.input-wrapper #free-trial-link-01");
	private By ButtonUp = By.cssSelector("a[href^='#'].button");
	private By AboutUs = By.cssSelector("ul.navbar-nav.mr-auto li.nav-item:last-child");
	private By AboutUs2 = By.cssSelector("ul.navbar-nav.mr-auto li.nav-item:last-child ul li:first-child a");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public WebElement getAboutUs() {
		return this.driver.findElement(AboutUs);
	}
	
	public WebElement getAboutUs2() {
		return this.driver.findElement(AboutUs2);
	}
	
	public WebElement getLogin() {
		return this.driver.findElement(Login);
	}
	public WebElement getName() {
		return this.driver.findElement(Name);
	}
	public WebElement getEmail() {
		return this.driver.findElement(Email);
	}
	public WebElement getButtonDown() {
		return this.driver.findElement(ButtonDown);
	}
	public WebElement getButtonUp() {
		return this.driver.findElement(ButtonUp);
	}
	
	
	public void SetName() {
		WebElement FullName = this.getName();
		FullName.sendKeys("Kokica Kokic");
	}
	public void SetMail() {
		WebElement WorkMail = this.getEmail();
		WorkMail.sendKeys("sobojow860@seomail.top");
	}
	public void freeTrial() {
		WebElement BtnDown = this.getButtonDown();
		BtnDown.click();
	}
	public void freeTrialUp() {
		WebElement BtnUp = this.getButtonUp();
		BtnUp.click();
	}
	
	public void GoLogin() {
		this.driver.findElement(Login).click();
	}
	
	public void ClickAboutUs() {
		this.driver.findElement(AboutUs).click();
	}
	
	public void ClickAboutUs2() {
		this.driver.findElement(AboutUs2).click();
	}
	
	
	
	
	
}
