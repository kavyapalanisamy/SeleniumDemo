package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvanced {

	private WebDriver driver;

	public EbayAdvanced(CommonSteps commonsteps) {
		this.driver = commonsteps.driversetup();
	}

	@Given("I am on Ebay Advanced Page")
	public void i_am_on_ebay_advanced_page() {
		System.out.println("I am on Ebay Advanced Page");
		System.out.println();
		driver.navigate().to("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I Click on Ebay Logo")
	public void i_click_on_ebay_logo() {
		System.out.println("I Click on Ebay Logo");
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	}

	@Then("I navigate to Ebay home page")
	public void i_navigate_to_ebay_home_page() {
		System.out.println("I navigate to Ebay home page");
		Assert.assertEquals("https://www.ebay.com/", driver.getCurrentUrl());

	}

	@When("I enter the details")
	public void i_enter_the_details(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
		driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//input[@class='price' and @name='_udlo']")).sendKeys(dataTable.cell(1, 2));
		driver.findElement(By.xpath("//input[@class='price' and @name='_udhi']")).sendKeys(dataTable.cell(1, 3));

		driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
		Thread.sleep(5000);

	}

}
