Feature:Hamburger Menu Messaging Functionality

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario:User must be able to send messages via campus
    Given the user clicks on the New Message link, they should see the people they can send messages to.
    When The user can choose the person to send the message to and write the subject of the message.
    And  The student should receive a “Success” message when the Send message button is clicked.
    Then  User can see list of sent messages
