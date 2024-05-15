package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_objects.Checkoutpageobjects;
import page_objects.HomePageobjects;
import page_objects.LoginPageFactory;
import page_objects.OverviewPageobject;

public class StepDefinition {
	public static WebDriver driver;

	private static final String BASE_URL = "https://www.saucedemo.com";

	private void initializePageObjects(Object page) {
		PageFactory.initElements(driver, page.getClass());
	}

	@Given("User is on the Login page of Sauce demo application")
	public void user_is_on_the_login_page_of_sauce_demo_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(BASE_URL);

	}

	@When("User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials_and(String user, String pass) {
		initializePageObjects(new LoginPageFactory());
		LoginPageFactory.usernamepf.sendKeys(user);
		LoginPageFactory.passwordpf.sendKeys(pass);
	}

	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		initializePageObjects(new LoginPageFactory());
		LoginPageFactory.loginpf.click();
	}

	@Given("User is logged in and on the home page")
	public void user_is_logged_in_and_on_the_home_page() {
		initializePageObjects(new HomePageobjects());
		HomePageobjects.Homepage_Logo.isDisplayed();
	}

	@When("User adds two distinct products to the cart")
	public void user_adds_two_distinct_products_to_the_cart() {
		initializePageObjects(new HomePageobjects());
		HomePageobjects.Back_Pack.click();
		HomePageobjects.Red_Tshirt.click();
	}

	@And("User clicks on the cart icon")
	public void user_clicks_on_the_cart_icon() {
		initializePageObjects(new HomePageobjects());
		HomePageobjects.Click_Cart.click();
	}

	@Then("User should see the two added products in the cart")
	public void user_should_see_the_two_added_products_in_the_cart() {
		initializePageObjects(new Checkoutpageobjects());
		Checkoutpageobjects.Product_1.isDisplayed();
		Checkoutpageobjects.Product_2.isDisplayed();
	}

	@Given("User clicks on the Checkout button")
	public void user_clicks_on_the_checkout_button() {
		initializePageObjects(new Checkoutpageobjects());
		Checkoutpageobjects.Checkout_Button.click();
	}

	@And("User enters their information {string}, {string}, and {string}")
	public void user_enters_their_information_and(String fname, String lname, String zip) {
		initializePageObjects(new Checkoutpageobjects());
		Checkoutpageobjects.First_Name.sendKeys(fname);
		Checkoutpageobjects.Last_Name.sendKeys(lname);
		Checkoutpageobjects.Posta_Code.sendKeys(zip);
	}

	@And("User clicks on the Continue button")
	public void user_clicks_on_the_continue_button() {
		initializePageObjects(new Checkoutpageobjects());
		Checkoutpageobjects.Continue.click();
	}

	@Then("User should see the overview of the price")
	public void user_should_see_the_overview_of_the_price() {
		initializePageObjects(new OverviewPageobject());
		OverviewPageobject.Total_Price.isDisplayed();
	}

	@And("User clicks on the Finish button")
	public void when_user_clicks_on_the_finish_button() {
		initializePageObjects(new OverviewPageobject());
		OverviewPageobject.Finish.click();
	}

	@Then("User should see the order confirmation message")
	public void user_should_see_the_order_confirmation_message() {
		String Actual_message = "Thank you for your order!";
		initializePageObjects(new OverviewPageobject());
		String confirmation_message = OverviewPageobject.Confirmation_Message.getText();
		Assert.assertEquals(Actual_message, confirmation_message);
	}
}
