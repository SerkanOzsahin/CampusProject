Feature: Delete Message in Outbox

  Scenario: Deleting messages in the outbox
    Given The user opens the outgoing messages list
    When The user clicks the hamburger menu,messaging and outbox
    Then The user successfully deletes messages