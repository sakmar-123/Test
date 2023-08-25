package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.functions.ExpectedCondition;

public class JoinAMeetingPage {
	WebDriver driver;

	public JoinAMeetingPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Join a Meeting']")
	WebElement JoinMeetingText;
	@FindBy(id = "us.zoom.videomeetings:id/btnGotoVanityUrl")
	WebElement PersonalLink;
	@FindBy(id = "us.zoom.videomeetings:id/btnGotoMeetingId")
	WebElement MeetingIdLink;
	@FindBy(id = "us.zoom.videomeetings:id/btnBack")
	WebElement backButton;
	@FindBy(id = "us.zoom.videomeetings:id/edtConfNumber")
	WebElement PlaceHolderjoinmeeting;
	@FindBy(id = "us.zoom.videomeetings:id/edtConfVanityUrl")
	WebElement PlaceholderPersonalLink;

	public void verifyjoinMeetingPage() {
		boolean joinLink = JoinMeetingText.isDisplayed();
		if (joinLink) {
			System.out.println("Verified user should be navigated to the Join a meeting page");
			Assert.assertTrue(true);
		} else {
			System.out.println("Failed: The user is not navigated to the Join a meeting page");
			Assert.assertTrue(false);

		}
	}

	public void personalMeetingLink() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(PersonalLink));
		PersonalLink.click();
	}

	public void meetingIdLink() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(MeetingIdLink));
		MeetingIdLink.click();
	}

	public void backbutton() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(backButton));
		backButton.click();
	}

	public void verifyPlaceHolderjoinmeeting() {
		String Actualtext = PlaceHolderjoinmeeting.getText();
		String ExpectedText = "Meeting ID";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();
	}

	public void verifyPlaceholderPersonalLink() {
		String Actualtext = PlaceholderPersonalLink.getText();
//		System.out.println(Actualtext);
		String ExpectedText = "Personal Link Name";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();
	}
}
