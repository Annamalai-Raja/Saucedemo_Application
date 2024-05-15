package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpageobjects {
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	public static WebElement Product_1;
	
	@FindBy(xpath = "//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")
	public static WebElement Product_2;
		
	@FindBy(id = "checkout")
	public static WebElement Checkout_Button;
	
	@FindBy(id = "first-name")
	public static WebElement First_Name;
	
	@FindBy(id = "last-name")
	public static WebElement Last_Name;
	
	@FindBy(id = "postal-code")
	public static WebElement Posta_Code;
	
	@FindBy(id = "continue")
	public static WebElement Continue;
	
	
}
