package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Steps.CommonSteps;

public class Ebay_Home_Elements {
	WebDriver driver;
	public Ebay_Home_Elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@title='Advanced Search']")
	public WebElement Advanced;
	
}
