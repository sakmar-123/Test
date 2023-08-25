package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class FolderPage {
	WebDriver driver;

	public FolderPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='Create a Folder']")
	WebElement CreateFolderText;
	@FindBy(id = ("us.zoom.videomeetings:id/zm_mm_folder_create"))
	WebElement Folder_create;
	@FindBy(xpath = "//android.widget.TextView[@text='Shubham']")
	WebElement verifyCreatedFolder;
	@FindBy(id = "us.zoom.videomeetings:id/moreBtn")
	WebElement MoreButton;
	@FindBy(xpath = "//android.widget.TextView[@text='Delete Folder']")
	WebElement DeleteFolder;

	public void CreateFolderText() {
		String Actualtext = CreateFolderText.getText();
//		System.out.println(Actualtext);
		String ExpectedText = "Create a Folder";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

	public void folder_create() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Folder_create));
		Folder_create.click();

	}

	public void TapNewFolder() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(verifyCreatedFolder));
		verifyCreatedFolder.click();
	}

	public void verifyCreatedFolder() {
		String Actualtext = verifyCreatedFolder.getText();
		System.out.println(Actualtext);
		String ExpectedText = "Shubham";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

	public void menuButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(MoreButton));
		MoreButton.click();

	}

	public void deleteFolder() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(DeleteFolder));
		DeleteFolder.click();
	}
}
