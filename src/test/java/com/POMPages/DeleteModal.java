package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DeleteModal {
	WebDriver driver;

	public DeleteModal(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "us.zoom.videomeetings:id/alertTitle")
	WebElement VerifyDeleteFoldermodal;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")
	WebElement DeleteFolderButton;

	public void verifyDeleteFoldermodal() {
		String Actualtext = VerifyDeleteFoldermodal.getText();
		String ExpectedText = "Delete Folder";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();
	}

	public void DeleteFolderButton() {
		WebDriverWait ww = new WebDriverWait(driver, 25);
		ww.until(ExpectedConditions.visibilityOf(DeleteFolderButton));
		DeleteFolderButton.click();
	}

}
