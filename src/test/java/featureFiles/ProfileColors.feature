Feature: Customizing Student Profile Colors

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: A student should be able to choose colors for their profile
    Given the student is on their profile settings page
    When they navigate to the color customization and choose colors
    Then the profile color should change
    