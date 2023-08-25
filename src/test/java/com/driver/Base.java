package com.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import Utilities.ReadConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class Base extends ReadConfig {

	@BeforeMethod
	public void LaunchApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability("appPackage", "us.zoom.videomeetings");
		capabilities.setCapability("appActivity", "com.zipow.videobox.LauncherActivity");
		capabilities.setCapability(MobileCapabilityType.APP,
				"D:\\Zoom\\Zoom - One Platform to Connect_5.15.5.15154_Apkpure.apk");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		log=LogManager.getLogger("Zoom");
		LocalDriver = new AndroidDriver<MobileElement>(url, capabilities);
		LocalDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Launched App");
	}


}
