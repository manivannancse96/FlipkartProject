

Feature: To Validate the Flipkart Login Page

  @tag1
  Scenario: Validating the flipkart login page using valid username and password
    Given Open the Flipkart url and click the login option
    When Enter the valid mobile number and click request otp button
    And Enter the current received otp number and click verify button
    Then Click the search option and enter required product then click search icon
    And Select a product which one need to be buying
    Then Click add to cart button and confirm card added successfully message


