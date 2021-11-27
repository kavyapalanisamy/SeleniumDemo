package actions;

import org.openqa.selenium.WebDriver;

import Elements.Ebay_Advanced_Elements;
import Steps.CommonSteps;

public class Advanced_Actions {
	WebDriver driver;
	Ebay_Advanced_Elements advancedelements;

	Advanced_Actions(CommonSteps commonsteps) {
		this.driver = commonsteps.driversetup();
		advancedelements = new Ebay_Advanced_Elements(driver);

	}
public void clickhomelogo()
{
	advancedelements.HomeLogo.click();
}
public void entersearchstring(String str)
{
	advancedelements.searchString.sendKeys(str);
}
}
