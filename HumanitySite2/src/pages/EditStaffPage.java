package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditStaffPage extends BasicPage {

	public EditStaffPage(WebDriver driver) {
		super(driver);
	}

	private By editDetails = By.cssSelector("#_cd_staff > div.right > div.EmployeeTop > a:nth-child(5)");
	private By uploadPic = By.id("fileupload");
	private By uploadSucessfully = By.cssSelector("#userAvatar5312385");
	private By nickName = By.id("nick_name");
	private By saveBtn = By.cssSelector("#act_primary");

	public WebElement geteditDetails() {
		return this.driver.findElement(editDetails);
	}

	public WebElement getuploadPic() {
		return this.driver.findElement(uploadPic);
	}

	public WebElement getnickName() {
		return this.driver.findElement(nickName);
	}

	public WebElement getsaveBtn() {
		return this.driver.findElement(saveBtn);
	}

	public void ClickEditDetails() {
		this.driver.findElement(editDetails).click();
	}

	public void UploadPicture(String path) {
		getuploadPic().sendKeys(new File(path).getAbsolutePath());
	}

	public void NickName() {
		this.getnickName().sendKeys("Joana");
	}

	public void ClickSave() {
		this.driver.findElement(saveBtn).click();
	}

	public boolean ImageUploadedSuccessfuly() {
		try {
			return this.driver.findElement(uploadSucessfully) != null;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean NickNameChanged() {
		try {
			return this.driver.findElement(nickName) != null;
		} catch (Exception e) {
			return false;
		}
	}
	
}
