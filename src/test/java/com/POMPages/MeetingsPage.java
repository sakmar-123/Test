package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MeetingsPage {
	public WebDriver driver;

	public MeetingsPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"More tab.\"]/android.widget.LinearLayout")
	WebElement MoreIcon;
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Join, button\"]")
	WebElement JoinMeetingIcon;
	@FindBy(xpath = "(//android.widget.TextView[@index='1'])[1]")
	WebElement VerifyJoinMeetingPage;

	public void moreIcon() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(MoreIcon));
		MoreIcon.click();
	}

	public void joinMeetingIcon() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(JoinMeetingIcon));
		JoinMeetingIcon.click();
	}

	public void verifyJoinMeetingPage() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(VerifyJoinMeetingPage));
		String ActualText = VerifyJoinMeetingPage.getText();
		String ExpectedTExt = "Meetings";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedTExt, ActualText);
		softassert.assertAll();
	}

}
