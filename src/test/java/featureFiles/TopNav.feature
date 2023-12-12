Feature: TopNav functionality

  @SmokeTest
  Scenario: Login and check the TopNav

    Given Navigate to Campus
    When Enter username and password and click login button
    Then Check The TopNav
