package c_MAVENTESTNeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MA_NeostoxLoginPageExcel {

	@FindBy(xpath = "//*[@id=\"lnk_toplinks_signin\"]/a")
	private WebElement username;

	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber")
	private WebElement mobilenumber;

	@FindBy(xpath = "//*[@id=\"lnk_signup1\"]")
	private WebElement button;

	public MA_NeostoxLoginPageExcel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void neostoxsign() {
		username.click();

	}

	public void neostoxmobilenumber(String mn) {
		mobilenumber.sendKeys(mn);
	}

	public void signinbutton() {
		button.click();
	}
}