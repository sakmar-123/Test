package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "us.zoom.videomeetings:id/btnSignup")
	WebElement SignUpButton;
	@FindBy(id = ("us.zoom.videomeetings:id/btnLogin"))
	WebElement SignInButton; 
	@FindBy(id = "us.zoom.videomeetings:id/btnJoinConf")
	WebElement JoinMeeting;
	@FindBy(id = "us.zoom.videomeetings:id/zm_welcome_anim_zoom_logo")
	WebElement HomePage;

	public void signInButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		SignInButton.click();

	}
	public void signUpButtonn() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SignUpButton));
		SignUpButton.click();

	}

	public void joinMeeting() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(JoinMeeting));
		JoinMeeting.click();

	}

	public void verifyHomePage() {
		boolean Logo = HomePage.isDisplayed();
		if (Logo) {
			
			Assert.assertTrue(true);
		} else {
			
			Assert.assertTrue(false);

		}
	}

}
