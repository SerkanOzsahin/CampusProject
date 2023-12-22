Feature: Downloading documents to the computer

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage
    Given Navigate to finance page

  Scenario: Downloading course grade and student transcript
    Given The student should be able to click on the grading button
    When The student should be able to click on the student transcript and download
    And The student should be able to click on the course grade and download