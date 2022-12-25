package c_MAVENTESTNeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MD_NeostoxHomepageExcel {

	@FindBy(id = "lbl_username")
	private WebElement profilename;

	
	@FindBy(id = "lbl_curbalancetop")
	private WebElement funds;

	public MD_NeostoxHomepageExcel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void neostoxprofileValidation() {
		String ActualUserid = profilename.getText();

		String ExpecxtedUserid = "Hi RAHUL BADGUJAR";

		if (ActualUserid.equals(ExpecxtedUserid))

		{
			System.out.println("TC passed user id is matching");
		} else {
			System.out.println("TC failed user id is notmatching");

		}
	}

	

	public void amount() {
		funds.getText();
		funds.getText();
		System.out.println(funds.getText());
	}

}