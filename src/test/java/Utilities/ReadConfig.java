package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.swing.text.html.HTML;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Report.ExtentRoport;

public class ReadConfig extends ExtentRoport {
	Properties properties;
	String path = "D:\\QuickBase_project1\\Appium\\Configefiles\\config.properties";

	public ReadConfig() {
		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public String getEmail() {
		String value = properties.getProperty("Email");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("Email is not specified in config file");
		}

	}

	public String getPassword() {
		String value = properties.getProperty("Password");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("Password is not specified in config file");

		}

	}

	public String getNewPassword() {
		String value = properties.getProperty("NewPasswordShort");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("NewPasswordShort is not specified in config file");

		}

	}

	public String getConfirmPassword() {
		String value = properties.getProperty("ConfirmPassword");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("ConfirmPassword is not specified in config file");

		}
	}

	public void Takescreenshot() throws IOException {
		Date cdate = new Date();
		String myfilename = cdate.toString().replace(" ", "_").replace(":", "-");
		File f = ((TakesScreenshot) LocalDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("Screenshots/" + myfilename + ".png"));
	}

}
