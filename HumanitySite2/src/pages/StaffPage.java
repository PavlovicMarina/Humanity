package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaffPage extends BasicPage {

	public StaffPage(WebDriver driver) {
		super(driver);
	}
	
	private By addStaffBtn = By.cssSelector("#act_primary");
	private By firstName1 = By.className("_ns_fname");
	private By lastName1 = By.className("_ns_lname");
	private By email1 = By.id("_ase1");
	private By firstName2 = By.id("_asf2");
	private By lastName2 = By.id("_asl2");
	private By email2 = By.id("_ase2");
	private By save = By.id("_as_save_multiple");
	
	public WebElement getaddStaffBtn() {
		return this.driver.findElement(addStaffBtn);
	}
	public WebElement getfirstName1() {
		return this.driver.findElement(firstName1);
	}
	public WebElement getlastName1() {
		return this.driver.findElement(lastName1);
	}
	public WebElement getemail1() {
		return this.driver.findElement(email1);
	}
	
	public WebElement getfirstName2() {
		return this.driver.findElement(firstName2);
	}
	public WebElement getlastName2() {
		return this.driver.findElement(lastName2);
	}
	public WebElement getemail2() {
		return this.driver.findElement(email2);
	}
	
	public WebElement getsave() {
		return this.driver.findElement(save);
	}
	
	public void ClickAddStafBtn() {
		this.driver.findElement(addStaffBtn).click();
	}
	public void AddEmployee1() {
		this.getfirstName1().sendKeys("John");
		this.getlastName1().sendKeys("John");
		this.getemail1().sendKeys("havit31575@clsn.top");
	}
	
	public void AddEmployee2() {
		this.getfirstName2().sendKeys("Lusi");
		this.getlastName2().sendKeys("Lusi");
		this.getemail2().sendKeys("finitix512@oncloud.ws");
	}
	public void ClickSave() {
		this.driver.findElement(save).click();
	}
	
	public boolean Employee1Added() {
		try {
			return this.driver.findElement(email1) != null;
		} catch (Exception e) {
			return false;
		}

	}
	public boolean Employee2Added() {
		try {
			return this.driver.findElement(email2) != null;
		} catch (Exception e) {
			return false;
		}

	}
	
	public void ForExcelStaff1( String Ime,String Prezime, String Email) {
		this.getfirstName1().sendKeys(Ime);
		this.getlastName1().sendKeys(Prezime);
		this.getemail1().sendKeys(Email);
	}
	
	public void ForExcelStaff2( String Ime,String Prezime, String Email) {
		this.getfirstName2().sendKeys(Ime);
		this.getlastName2().sendKeys(Prezime);
		this.getemail2().sendKeys(Email);
	}
	
	
	}
