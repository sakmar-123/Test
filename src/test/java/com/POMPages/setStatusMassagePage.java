package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setStatusMassagePage {

	WebDriver driver;

	public setStatusMassagePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "us.zoom.videomeetings:id/edtCustomStatus")
	WebElement CustomTextBox;
	@FindBy(id = "us.zoom.videomeetings:id/btnDisplayTime")
	WebElement DisplayTime;
	@FindBy(id = "us.zoom.videomeetings:id/btnSave")
	WebElement SaveButton;
	@FindBy(xpath = "(//android.widget.LinearLayout[1]/android.widget.TextView)[2]")
	WebElement OneHr;
	@FindBy(id = "us.zoom.videomeetings:id/btnConfirm")
	WebElement ConfirmButton;
	@FindBy(id = "us.zoom.videomeetings:id/imgClear")
	WebElement ClearStatus;
//	(//android.widget.LinearLayout[1]/android.widget.TextView)[1]
	public void CustomTextBox() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(CustomTextBox));
		CustomTextBox.sendKeys("I will be on leave");

	}

	public void displayTime() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(DisplayTime));
		DisplayTime.click();
	}

	public void saveButton() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(SaveButton));
		SaveButton.click();
	}

	public void OneHr() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(OneHr));
		OneHr.click();
	}

	public void confirmButton() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(ConfirmButton));
		ConfirmButton.click();
	}

	public void clearedStatus() {
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.visibilityOf(ClearStatus));
		ClearStatus.click();
	}

}
