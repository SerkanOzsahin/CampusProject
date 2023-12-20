Feature: Student Login

  Scenario Outline: Unsuccessful Student Login with Invalid Credentials
    Given the user navigates to campus website
    When the user logs in with the invalid "<username>" and "<password>"
    Then the user should see an error message
    Examples:
      | username    | password |
      | Student_4   | 1234     |
      | Student_001 | S12345   |
      | Student_001 | 1234     |
