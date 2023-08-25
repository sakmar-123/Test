package com.POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignUpPage01 {
	WebDriver driver;

	public SignUpPage01(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='Sign Up']")
	WebElement SignUptext;
	@FindBy(id = "us.zoom.videomeetings:id/txtBirthEditText")
	WebElement BirthAgeTextbox;
	@FindBy(id = "us.zoom.videomeetings:id/btnSignupContinue")
	WebElement ContinueButton;

//	System.out.println(driver.findElement(By.id("us.zoom.videomeetings:id/txtTitle")).getText());
//	System.out.println(driver.findElement(By.id("us.zoom.videomeetings:id/txtBirthEditText")).getText());
	public void birthAgeTextbox() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(BirthAgeTextbox));
		BirthAgeTextbox.sendKeys("1996");

	}

	public void continueButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(ContinueButton));
		ContinueButton.click();

	}
	public void verifySignUpPage() {
		String Actualtext=SignUptext.getText();
		String ExpectedText="Sign Up";
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

	public void verifyPlaceholderBirthEditText() {
		String Actualtext=BirthAgeTextbox.getText();
		String ExpectedText="Birth Year";
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

}
