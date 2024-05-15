package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
	
	
	@FindBy(id = "user-name")
	public static WebElement usernamepf;
	
	@FindBy(id = "password")
	public static	WebElement passwordpf;
	
	@FindBy(id = "login-button")
	public static WebElement loginpf;
	
	

}
