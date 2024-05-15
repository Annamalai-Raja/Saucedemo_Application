# Sauce Demo Application Automation

This project contains automated test scenarios for the Sauce demo application. The tests are written in Gherkin language and can be executed using a BDD framework like Cucumber.

## Features

The following features of the Sauce demo application are covered in the tests:

1. **Login:** Validates successful login with correct credentials.
2. **Add Products to Cart:** Tests the functionality of adding multiple products to the cart.
3. **Checkout Process:** Completes the checkout process for products in the cart and verifies the order confirmation message.

## Scenarios

The test scenarios are described in the `saucedemo.feature` file. Each scenario is written as a separate `Scenario` or `Scenario Outline` in Gherkin language, which includes a series of `Given`, `When`, `Then` steps.

## Running the Tests

To run the tests, you'll need a BDD framework like Cucumber that supports Gherkin language. You'll also need a WebDriver to interact with the browser.

Please refer to the documentation of your test runner and WebDriver for instructions on how to run the tests.

## Contributing

Contributions are welcome. Please feel free to submit a pull request or open an issue for any bugs or feature requests.
