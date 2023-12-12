Feature: TopNav functionality

  @SmokeTest
  Scenario: Login and check the TopNav

    Given Attend to Campus Page
    When Enter username and password
    Then Check The TopNav
