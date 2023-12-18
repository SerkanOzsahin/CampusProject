Feature: Student Grading Information

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: View Course Grades and Transcripts
    When The student clicks on Grading
    Then The student should see course grades and transcripts
