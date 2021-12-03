package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Configur {

	private static WebDriver driver;
	String configDrive = "webdriver.chrome.driver";
	String caminhoDrive = "C:\\Drivers\\ChromeDriver\\chromedriver.exe";

	@Before
	public void beforeCenario() {
		System.setProperty(configDrive, caminhoDrive);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com.br/");
	}

	@After
	public void afterCenario() {
		driver.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}