package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.Advanced_Actions;
import actions.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

private WebDriver driver;

public EbayHome_Steps(CommonSteps commonsteps) {
	this.driver = commonsteps.driversetup();
}

	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
		System.out.println("I am on Ebay Home Page");

		driver.navigate().to("https://www.ebay.com/");
		

		// Webdriver driver=new ChromeDriver();

	}

	@When("I Click on Advanced Link")
	public void i_click_on_advanced_link() {
		System.out.println("I Click on Advanced Link");
		driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
		
	}

	@Then("I navigate to advanced search")
	public void i_navigate_to_advanced_search() {
		System.out.println("I navigate to advanced search");
		String actual = driver.findElement(By.xpath("//td[@id='gh-title']")).getText();
		Assert.assertEquals(actual, "Advanced Search");
		// driver.quit();
	}

	@When("I search for {string}")
	public void i_search_for_iphone_11(String str) {
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys(str);
		driver.findElement(By.cssSelector("#gh-btn")).click();

	}

	@Then("I validate  {int} search results")
	public void i_validate_search_results(Integer int1) throws InterruptedException {
		String st = driver.findElement(By.xpath("//h1/span[1]")).getText();
		Integer int2 = Integer.parseInt(st);
		if (int2 <= int1) {
			driver.findElement(By.xpath("//a[@id='gh-la']")).click();
			Thread.sleep(10000);
		}
	}

	@When("I click on {string}")
	public void i_click_on(String string) {
		driver.findElement(By.linkText(string)).click();

	}

	@Then("I validate the {string} and {string}")
	public void i_validate_the_and(String string, String string2) {
		String exp = driver.getCurrentUrl();
		Assert.assertEquals(exp, string);
		String actual = driver.findElement(By.xpath("//h1[@class='title-banner__title']")).getText();
		Assert.assertEquals(actual, string2);
	}

}
