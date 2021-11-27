package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Elements.Ebay_Home_Elements;
import Steps.CommonSteps;
import Steps.EbayHome_Steps;

public class HomePage_Actions {
	Ebay_Home_Elements home_elements;
	private WebDriver driver;

	public HomePage_Actions(CommonSteps commonsteps) {
		this.driver = commonsteps.driversetup();
		home_elements = new Ebay_Home_Elements(driver);
	}
	 public void advancedsearchclick()
	 {
		 home_elements.Advanced.click();
	 }
}
