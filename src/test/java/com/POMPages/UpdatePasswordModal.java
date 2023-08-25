package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class UpdatePasswordModal {
	WebDriver driver;

	public UpdatePasswordModal(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	//
	@FindBy(id = "us.zoom.videomeetings:id/button2")
	WebElement CancelButton;
	@FindBy(id = "us.zoom.videomeetings:id/button1")
	WebElement OkButton;
	@FindBy(id = "us.zoom.videomeetings:id/alertTitle")
	WebElement UpdateModalText;
	public void verifyUpdateModalText() {
		String Expectedtext = "Sign Me Out From All Devices";
		String Actualtext = UpdateModalText.getText();
//		System.out.println(Actualtext);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(Expectedtext, Actualtext);
		softassert.assertAll();
	}
	public void cancelButton() {
		CancelButton.click();
	}
	
}
