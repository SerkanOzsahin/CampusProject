Feature: Online Payment in Finance Section

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: Making payment via Finance in hamburger menu
    Given The user opens the hamburger menu and selects Finance
    When The user enters the payment amount, selects Online Payment and clicks Make Payment
    Then The user receives a payment confirmation
