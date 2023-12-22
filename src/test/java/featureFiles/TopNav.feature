Feature: TopNav functionality

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  @SmokeTest
  Scenario: Login and check the TopNav

    Given Attend to Campus Page

    When Check The TopNav

