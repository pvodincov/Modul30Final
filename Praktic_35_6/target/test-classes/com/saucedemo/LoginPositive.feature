Feature: login
  Scenario: successful login to the site as a standard User
    Given User is on Login page url 'https://www.saucedemo.com/'
    When User enters UserName 'standard_user'
    And User enters Password 'secret_sauce'
    And User push button Login
    Then assert that expectedResult is 'ADD TO CART'












