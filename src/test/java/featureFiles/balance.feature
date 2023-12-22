Feature:Amount Of Dept Remaining In Balance

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario:The user pays the dept in the balance
    Given The user displays the remaining amount
    When The user makes the payment
