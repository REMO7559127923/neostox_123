package c_MAVENTESTNeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MB_NeostoxpasswordExcel {

	@FindBy(id = "txt_accesspin")
	private WebElement password;

	@FindBy(xpath = "//*[@id='lnk_submitaccesspin']")
	private WebElement acceptbutton;

	public MB_NeostoxpasswordExcel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void putpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void submitbutton() {

		acceptbutton.click();

	}

}