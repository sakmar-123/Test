package com.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeamChatPage {
	WebDriver driver;

	public TeamChatPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Team Chat tab\"]")
	WebElement TeamChat ;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Folders, button, 2 of 7\"]")
	WebElement CreateFolderButton;
	//:-
//	Create a folder: 
	public void teamChatButton() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TeamChat));
		TeamChat.click();

	}

	public void createFolderButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(CreateFolderButton));
		CreateFolderButton.click();
	}

}
