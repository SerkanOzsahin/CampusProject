Feature: Student Login

  Scenario: Successful Student Login
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage
