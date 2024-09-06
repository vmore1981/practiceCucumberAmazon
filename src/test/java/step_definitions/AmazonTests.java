package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomepage;


public class AmazonTests {

	
	AmazonHomepage page = new AmazonHomepage();
	BrowserUtils utils = new BrowserUtils();
	
	@Given("user is on the main Amazon page")
	public void user_is_on_the_main_amazon_page() {

		Driver.getDriver().get(DataReader.getProperty("url"));
	
	}

	@When("verify amazon page title")
	public void verify_amazon_page_title() {

		Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com. Spend less. Smile more."));
		// another way:
	}
	
	@When("verify dropdown value is by default {string}")
	public void verify_dropdown_value_is_by_default(String string) {

		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//option[@selected='selected' and text()='" + string + "']")).isDisplayed());
	
	}

	@When("select department {string} and search {string}")
	public void select_department_and_search_coffee_mug(String string, String string2) throws InterruptedException {

		utils.selectWithVisibleText(page.dropdownDept, string);
		
		Thread.sleep(2000);
		page.searchInput.sendKeys(string2, Keys.ENTER);
	
		Thread.sleep(500);
		Driver.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

	@When("verify you are on {string} search result page")
	public void verify_you_are_on_search_result_page(String string) {

		Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
	
	}

	@Then("verify that you are in {string} department page")
	public void verify_that_you_are_in_department_page(String string) {

		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//option[@selected='selected' and text()='" + string + "']")).isDisplayed());
	
	}
	
}