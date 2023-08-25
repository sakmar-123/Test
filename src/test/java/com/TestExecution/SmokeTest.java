package com.TestExecution;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import com.POMPages.CreateFolderPage;
import com.POMPages.DeleteModal;
import com.POMPages.FolderPage;
import com.POMPages.HomePage;
import com.POMPages.JoinAMeetingPage;
import com.POMPages.MeetingsPage;
import com.POMPages.MoveToFolderPage;
import com.POMPages.MyProfilePage;
import com.POMPages.SignInPage;
import com.POMPages.SignUpPage01;
import com.POMPages.SignUpPage02;
import com.POMPages.TeamChatPage;
import com.POMPages.UpdatePassword;
import com.POMPages.UpdatePasswordModal;
import com.POMPages.VerificationPage;
import com.POMPages.setStatusMassagePage;
import com.driver.Base;


public class SmokeTest extends Base {
	@Test(enabled = true)
	public void Test01() throws IOException {
		test = reports.createTest("Verify the update password page.");
		HomePage lg = new HomePage(LocalDriver);
		lg.signInButton();
		SignInPage sp = new SignInPage(LocalDriver);
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		MeetingsPage mp = new MeetingsPage(LocalDriver);
		mp.moreIcon();
		MyProfilePage mpf = new MyProfilePage(LocalDriver);
		mpf.displayName();
		mpf.updatePasswordButton();
		UpdatePassword up = new UpdatePassword(LocalDriver);
		up.verifyUpdatePasswordPage();
		Takescreenshot();
		up.oldPasswordTextBox();
		up.newPasswordTextBox();
		up.confirmPasswordTextBox();
		up.saveButton();
		UpdatePasswordModal upm = new UpdatePasswordModal(LocalDriver);
		upm.verifyUpdateModalText();
		upm.cancelButton();
		up.verifyUpdatePasswordPage();
		LocalDriver.quit();

	}

	@Test(enabled = true)
	public void Test02() throws InterruptedException {
		test = reports.createTest("Verify that user can create and delete a new folder");
		HomePage lg = new HomePage(LocalDriver);
		lg.signInButton();
		SignInPage sp = new SignInPage(LocalDriver);
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		TeamChatPage tc = new TeamChatPage(LocalDriver);
		tc.teamChatButton();
		tc.createFolderButton();
		FolderPage fp = new FolderPage(LocalDriver);
		fp.folder_create();
		CreateFolderPage cp = new CreateFolderPage(LocalDriver);
		cp.verifyCreateFolder();
		cp.folderTextField();
		cp.nextButton();
		MoveToFolderPage mp = new MoveToFolderPage(LocalDriver);
		mp.verifyMoveToFolder();
		mp.createButton();
		mp.btnBack();
		fp.verifyCreatedFolder();
		fp.TapNewFolder();
		fp.menuButton();
		fp.deleteFolder();
		DeleteModal dm = new DeleteModal(LocalDriver);
		dm.verifyDeleteFoldermodal();
		dm.DeleteFolderButton();
		LocalDriver.quit();

	}

	@Test(enabled = true)
	public void Test03() throws InterruptedException {
		test = reports.createTest("Verify sign up page.");
		SignUpPage01 ss = new SignUpPage01(LocalDriver);
		HomePage lg = new HomePage(LocalDriver);
		lg.signUpButtonn();
		ss.verifySignUpPage();
		ss.verifyPlaceholderBirthEditText();
		ss.birthAgeTextbox();
		ss.continueButton();
		SignUpPage02 sp = new SignUpPage02(LocalDriver);
		sp.verifyEmailplaceholdertext();
		sp.emailText();
		sp.continueButton();
		VerificationPage vp = new VerificationPage(LocalDriver);
		vp.backButton();
		ss.verifySignUpPage();
		LocalDriver.quit();

	}

	@Test(enabled = true)
	public void Test04() {
		test = reports.createTest("Verify join a meeting page");
		HomePage lg = new HomePage(LocalDriver);
		lg.verifyHomePage();
		lg.signInButton();
		SignInPage sp = new SignInPage(LocalDriver);
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		MeetingsPage mp = new MeetingsPage(LocalDriver);
		mp.joinMeetingIcon();
		JoinAMeetingPage joinmeeting = new JoinAMeetingPage(LocalDriver);
		joinmeeting.verifyjoinMeetingPage();
		joinmeeting.personalMeetingLink();
		joinmeeting.verifyPlaceholderPersonalLink();
		joinmeeting.meetingIdLink();
		joinmeeting.verifyPlaceHolderjoinmeeting();
		joinmeeting.backbutton();
		LocalDriver.quit();

	}

	@Test(enabled = true)
	public void Test05() throws IOException {
		test = reports.createTest("Verify the user can set and clear status massage.");
		HomePage lg = new HomePage(LocalDriver);
		lg.signInButton();
		SignInPage sp = new SignInPage(LocalDriver);
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		MeetingsPage mp = new MeetingsPage(LocalDriver);
		mp.moreIcon();	
		MyProfilePage mpf = new MyProfilePage(LocalDriver);
		mpf.displayName();
		mpf.setstatusMassage();
		setStatusMassagePage sm = new setStatusMassagePage(LocalDriver);
		sm.CustomTextBox();
		sm.displayTime();
		sm.OneHr();
		sm.confirmButton();
		sm.clearedStatus();
		sm.CustomTextBox();
		sm.saveButton();
		mpf.verifyMyProfilepage();
		LocalDriver.quit();

	}

}
