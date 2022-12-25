package c_MAVENTESTNeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ME_Neostoxlogoutexcel {
	@FindBy(id = "lbl_username")
	private WebElement userName;
	@FindBy(xpath = "//span[normalize-space()='Logout']")
	private WebElement logout;

	public ME_Neostoxlogoutexcel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void signout() {
		userName.click();
		logout.click();
		Reporter.log("closing browser",true);
	}

}