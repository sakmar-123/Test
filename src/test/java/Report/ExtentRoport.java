package Report;

import java.util.Date;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ExtentRoport {
	public ExtentSparkReporter htmlReport;
	public static ExtentReports reports;
	public ExtentTest test;
	public static AndroidDriver<MobileElement> LocalDriver;
	public Logger log;

	@BeforeTest
	public void startreport() {
		Date cdate = new Date();
		String myfileName = cdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(myfileName);
		htmlReport = new ExtentSparkReporter(
				"D:\\QuickBase_project1\\Appium\\Reports\\Html\\Report.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		// configuration to change the look and feel
		htmlReport.config().setDocumentTitle("Extent Report");
		htmlReport.config().setReportName("Test Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm a '('zzz')'");

	}

	@AfterMethod
	public void getTestresult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));

		} else if ((result.getStatus() == ITestResult.SUCCESS)) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));

		} else if ((result.getStatus() == ITestResult.SKIP)) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.YELLOW));

		}
	}

	@AfterTest
	public void tearDown() {
		reports.flush();

	}

}
