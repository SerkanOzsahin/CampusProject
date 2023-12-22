Feature: Hamburger Menu Messages

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: Hamburger Menu manage my messages
    Given The user opens the hamburger menu and selects message
    Then Student should be able to view and click on the link new message inbox outbox trash