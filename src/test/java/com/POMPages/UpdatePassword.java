package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Utilities.ReadConfig;

public class UpdatePassword {
	WebDriver driver;

	public UpdatePassword(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	//
	@FindBy(xpath = "//android.widget.TextView[@text='Update Password']")
	WebElement UpdatePasswordText;
	@FindBy(id = "us.zoom.videomeetings:id/edtOldPwd")
	WebElement OldPasswordTextBox;
	@FindBy(id = "us.zoom.videomeetings:id/edtNewPwd")
	WebElement NewPwdTextBox;
	@FindBy(id = "us.zoom.videomeetings:id/edtConfirmPwd")
	WebElement ConformPassword;
	@FindBy(id = "us.zoom.videomeetings:id/btnSave")
	WebElement SaveButton;

	public void verifyUpdatePasswordPage() {
		String Expectedtext = "Update Password";
		String Actualtext = UpdatePasswordText.getText();
//		System.out.println(Actualtext);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(Expectedtext, Actualtext);
		softassert.assertAll();
	}

	public void oldPasswordTextBox() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(OldPasswordTextBox));
		ReadConfig rc=new ReadConfig();
		OldPasswordTextBox.sendKeys(rc.getPassword());
//		OldPasswordTextBox.sendKeys("Shubham@321");
	}

	public void newPasswordTextBox() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(NewPwdTextBox));
		ReadConfig rc=new ReadConfig();
		NewPwdTextBox.sendKeys(rc.getNewPassword());
//		NewPwdTextBox.sendKeys("Shubham@321");
	}

	public void confirmPasswordTextBox() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(ConformPassword));
		ReadConfig rc=new ReadConfig();
		ConformPassword.sendKeys(rc.getConfirmPassword());
//		ConformPassword.sendKeys("Shubham@321");
	}

	public void saveButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SaveButton));
		SaveButton.click();
	}

}
