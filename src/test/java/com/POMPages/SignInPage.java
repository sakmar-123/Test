package com.POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ReadConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignInPage {
	public AndroidDriver<MobileElement> driver;

	public SignInPage(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = ("us.zoom.videomeetings:id/edtUserName"))
	WebElement edtUserName;
	@FindBy(id = ("us.zoom.videomeetings:id/edtPassword"))
	WebElement edtPassword;
	@FindBy(id = ("us.zoom.videomeetings:id/btnLoginZoom"))
	WebElement btnLoginZoom;
	@FindBy(id = ("us.zoom.videomeetings:id/zm_permission_guide_notnow"))
	WebElement btnNotnow;
	@FindBy(id = ("us.zoom.videomeetings:id/zm_permission_guide_enable"))
	WebElement btnGetStart;

//devengodara3@gmail.com   @Devender1322@
	public void EnterEmailid() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(edtUserName));
//		edtUserName.sendKeys("shubhamakmar199@gmail.com");
		ReadConfig rc=new ReadConfig();
		edtUserName.sendKeys(rc.getEmail());

	}

	public void EnterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(edtPassword));
//		edtPassword.sendKeys("Shubham@321");
		ReadConfig rc=new ReadConfig();
		edtPassword.sendKeys(rc.getPassword());

	}

	public void ClickSignInBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnLoginZoom));
		btnLoginZoom.click();

	}

	public void ClickbtnNotnow() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnNotnow));
		btnNotnow.click();

	}

	public void ClickbtnGetStart() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnGetStart));
		btnGetStart.click();

	}
	

}
