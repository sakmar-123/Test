package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class MyProfilePage {

	WebDriver driver;

	public MyProfilePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='My Profile']")
	WebElement MyProfile;
	@FindBy(id = "us.zoom.videomeetings:id/txtDisplayName")
	WebElement DisplayName;
	@FindBy(id = "us.zoom.videomeetings:id/btnPassword")
	WebElement UpdatePasswordButton;
	@FindBy(id = "us.zoom.videomeetings:id/panelPersonalNote")
	WebElement SetstatusMassage;

	public void displayName() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(DisplayName));
		DisplayName.click();

	}

	public void updatePasswordButton() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(UpdatePasswordButton));
		UpdatePasswordButton.click();
	}

	public void verifyMyProfilepage() {
		String Actualtext = MyProfile.getText();
//		System.out.println(Actualtext);
		String ExpectedText = "My Profile";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();
	}
	public void setstatusMassage() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(SetstatusMassage));
		SetstatusMassage.click();
	}
}
