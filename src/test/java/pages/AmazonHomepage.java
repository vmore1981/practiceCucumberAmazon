package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class AmazonHomepage {

	
	public AmazonHomepage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	
	@FindBy (css = ".inventory_item_price")
	public List<WebElement> itemPrices;
	
	
	@FindBy (xpath = "//span[text()='Products']")
	public WebElement homepage_product_text;

	
	@FindBy (xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")
	public WebElement invalid_message;
	
	
	@FindBy (id = "searchDropdownBox")
	public WebElement dropdownDept;
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchInput;

	
	
}

