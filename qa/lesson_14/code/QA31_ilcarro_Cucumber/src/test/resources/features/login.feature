Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Check User can't login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And User quites browser
    Examples:
      | email           | password    |
      | neuer@gmail.com | Neuer123455 |
      | neuer@gmail.com | neuer12345$ |
      | neuer@gmail.com | NEUER12345$ |
      | neuer@gmail.com | Neuerrrrrr$ |
      | neuer@gmail.com | 1234567890$ |
      | neuer@gmail.com | $$$$$$$$$$$ |
