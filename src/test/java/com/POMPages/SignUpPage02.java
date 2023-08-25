package com.POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SignUpPage02 {
	WebDriver driver;

	public SignUpPage02(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "us.zoom.videomeetings:id/edtEmail")
	WebElement email;
	@FindBy(id = "us.zoom.videomeetings:id/btnSignupContinue")
	WebElement btnSignupContinue;

	public void emailText() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("shubhamakmar199@gmail.com");

	}

	public void continueButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnSignupContinue));
		btnSignupContinue.click();
	}

	public void verifyEmailplaceholdertext() {
		String Actualtext = email.getText();
		String ExpectedText = "Email";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

}
