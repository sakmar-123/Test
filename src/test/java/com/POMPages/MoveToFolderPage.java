package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class MoveToFolderPage {
	WebDriver driver;

	public MoveToFolderPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Move to Folder']")
	WebElement moveToFolder;
	@FindBy(id = "us.zoom.videomeetings:id/btnOK")
	WebElement CreateButton;
	@FindBy(id = "us.zoom.videomeetings:id/btnOK")
	WebElement TextVerify;
	@FindBy(id = "us.zoom.videomeetings:id/btnBack")
	WebElement btnBack;

	public void createButton() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(CreateButton));
		CreateButton.click();
	}

	public void verifyMoveToFolder() {
		String actualText = moveToFolder.getText();
		String ExpectedText ="Move to Folder";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, actualText);
		softassert.assertAll();

	}

	public void btnBack() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(btnBack));
		btnBack.click();
	}
}
