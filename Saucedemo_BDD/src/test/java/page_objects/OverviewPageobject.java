package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPageobject {
	@FindBy(xpath = "//div[@class='summary_total_label']")
	public static WebElement Total_Price;
	
	@FindBy(id = "finish")
	public static WebElement Finish;
		
	@FindBy(xpath = "//h2[@class='complete-header']")
	public static WebElement Confirmation_Message;
}
