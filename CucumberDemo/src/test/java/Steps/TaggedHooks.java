package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {
	private WebDriver driver;

	public TaggedHooks(CommonSteps commonsteps) {
		this.driver = commonsteps.driversetup();
	}

	@Before(value = "@setg", order = 0)
	public void setg() {
		System.out.println("Before scenario specific hook");
	}

	@After(value = "@Test", order = 1)
	public void Test() {
		System.out.println("After scenario specific hook");
	}
}
