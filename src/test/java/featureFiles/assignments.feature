Feature: Access Assigned Tasks

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario:The user access to assigned tasks
    Given The user achieves tasks
    When The user clicks on tasks
