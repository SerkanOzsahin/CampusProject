Feature:Access to Calendar Feature courses

  Scenario: Access to Calendar Feature courses
    Given The student should be able to access the information of the relevant course
    When The student should be able to see the name of the course in the pop-up window
    And You should see in the pop-up window whether the lesson has started or not.
    Then Student, published(P), started(S), or finished(E) information when clicking on a lesson should see the screen.
