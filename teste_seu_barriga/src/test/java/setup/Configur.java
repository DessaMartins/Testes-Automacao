package setup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Configur {

	private static WebDriver driver;
	String configDrive = "webdriver.chrome.driver";
	String caminhoDrive = "C:\\Drivers\\ChromeDriver\\chromedriver.exe";
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
	public static Object java;

	@Before
	public void beforeCenario(Scenario cenario) {
		
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
			}



			extentTest = extentReport.createTest(cenario.getId());

		System.setProperty(configDrive, caminhoDrive);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com.br/");
	}

	@After
	public void afterCenario(Scenario cenario) {

	java.io.File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("target/screenshots/"+cenario.getName()+".jpg"));
	} catch (IOException e) {
	e.printStackTrace();
	
	}
	driver.close();
	}
	

	public static ExtentTest getExtentTest() {
	return extentTest;
	}
	

	public static WebDriver getDriver() {
		return driver;
	}
	
}