package c_MAVENTESTNeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MC_NeostoxWarningpageExcel {
	@FindBy(xpath = "(//a[text()='OK'])[2]")
	private WebElement alert;

	@FindBy(xpath = "(//a[text()='Close'])[5]")
	private WebElement popupClose;

	public MC_NeostoxWarningpageExcel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void handlepopup() throws InterruptedException  {
	   
		alert.click();
		  Thread.sleep(5000); 
	
		popupClose.click();
	}
}
