package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CreateFolderPage {
	WebDriver driver;

	public CreateFolderPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='Create a Folder']")
	WebElement CreateFolderText;
	@FindBy(id = ("us.zoom.videomeetings:id/edtFolderName"))
	WebElement FolderTextField;
	@FindBy(id = "us.zoom.videomeetings:id/btnNext")
	WebElement Nextbutton;

	public void verifyCreateFolder() {
		String Actualtext = CreateFolderText.getText();
//		System.out.println(Actualtext);
		String ExpectedText = "Create a Folder";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedText, Actualtext);
		softassert.assertAll();

	}

	public void folderTextField() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(FolderTextField));
		FolderTextField.sendKeys("Shubham");

	}

	public void nextButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Nextbutton));
		Nextbutton.click();

	}
}
