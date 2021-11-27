package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Advanced_Elements {
	@FindBy(xpath="//a[@id='gh-la']")
	public WebElement HomeLogo;
	@FindBy(xpath="//input[@id='_nkw']")
	public WebElement searchString;
	@FindBy(xpath="//input[@id='_ex_kw']")
	public WebElement excludeString;
	@FindBy(xpath="//input[@class='price' and @name='_udlo']")
	public WebElement minprice;
	@FindBy(xpath="//input[@class='price' and @name='_udhi']")
	public WebElement maxprice;
	@FindBy(xpath="//button[@id='searchBtnLowerLnk']")
	public WebElement search;
	
	WebDriver driver;
	public Ebay_Advanced_Elements (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
