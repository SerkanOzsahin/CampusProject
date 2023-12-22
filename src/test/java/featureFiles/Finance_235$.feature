Feature: 235$ Payment

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage
    Given  Attend to Campus Page

  Scenario: Make payment via Stripe
    Given Go to My Finance page
    When Make payment via Stripe
    Then User should see Payment accepted
