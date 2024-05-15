package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageobjects {
	
	
	@FindBy(xpath ="//div[@class='app_logo']" )
	public static WebElement Homepage_Logo;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public static WebElement Back_Pack;
	
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	public static WebElement Red_Tshirt;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public static WebElement Click_Cart;
}
