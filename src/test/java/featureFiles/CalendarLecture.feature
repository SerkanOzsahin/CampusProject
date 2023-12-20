Feature: Course Content Replay

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario: Accessing Lecture Videos
    Given The student is at Calendar page
    When The student goes to My Courses and chooses a completed course
    Then The student should see a list of content
