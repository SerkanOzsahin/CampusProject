Feature:Hamburger Menu Finance

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: Payment process for the course
    Given Navigate to finance page
    When The user should be able to click on the finance button below the hamburger button
    Then The user should be able to click my finance button
    And The user can complete the payment transaction
    Then The user can see the message that the payment transaction is completed
