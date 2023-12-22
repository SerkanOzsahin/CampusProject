Feature: Delete Message in Outbox

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: Deleting messages in the outbox
    Given The user opens the outgoing messages list
    When The user clicks the hamburger menu,messaging and outbox
    Then The user successfully deletes messages