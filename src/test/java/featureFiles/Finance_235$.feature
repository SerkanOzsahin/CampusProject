Feature: 235$ Payment

  Background:
    Given  Attend to Campus Page

  Scenario: Make payment via Stripe
    Given Go to My Finance page
    When Make payment via Stripe
    Then User should see Payment accepted