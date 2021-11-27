package actions;

import org.openqa.selenium.WebDriver;

import Steps.CommonSteps;

public class CommonActions {
WebDriver driver;
	CommonActions(CommonSteps commonsteps)
	{
		this.driver=commonsteps.driversetup();
	}
	public void geturl(String url)
	{
		driver.get(url);
	}
	public String getcurrenturl() {
	
		return driver.getCurrentUrl();
	}
}
