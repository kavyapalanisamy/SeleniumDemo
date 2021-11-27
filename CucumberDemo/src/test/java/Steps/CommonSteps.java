package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	private WebDriver driver;

	@Before(order = 0)
	public void Setup() {
		System.out.println("Global before hook");
		System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After(order = 0)
	public void Teardown() throws InterruptedException {
		System.out.println("Global After hook");
		driver.quit();
		Thread.sleep(1000);
	}

	public WebDriver driversetup() {
		return driver;
	}
}
