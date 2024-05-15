Feature: Automation of Sauce demo application

  Scenario Outline: Validate successful login with correct credentials
    Given User is on the Login page of Sauce demo application
    When User enters valid credentials "<username>" and "<password>"
    And User clicks on the Login button

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Add multiple products to the cart
    Given User is logged in and on the home page
    When User adds two distinct products to the cart
    And User clicks on the cart icon
    Then User should see the two added products in the cart

  Scenario Outline: Complete the checkout process for products in cart
    Given User clicks on the Checkout button
    And User enters their information "<Firstname>", "<Lastname>", and "<Zipcode>"
    And User clicks on the Continue button
    Then User should see the overview of the price
    And User clicks on the Finish button
    Then User should see the order confirmation message

    Examples: 
      | Firstname | Lastname | Zipcode |
      | John      | Snow     |   45625 |
