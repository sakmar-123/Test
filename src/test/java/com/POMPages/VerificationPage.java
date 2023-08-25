package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerificationPage {
	WebDriver driver;

	public VerificationPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}
//	@FindBy(id="us.zoom.videomeetings:id/edtEmail") WebElement email;
//	@FindBy(id="us.zoom.videomeetings:id/btnSignupContinue") WebElement btnSignupContinue;
	@FindBy(id="us.zoom.videomeetings:id/btnBack") WebElement BackButton;
	
	public void backButton() {
		WebDriverWait ww=new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.visibilityOf(BackButton));
		BackButton.click();
	}

}
