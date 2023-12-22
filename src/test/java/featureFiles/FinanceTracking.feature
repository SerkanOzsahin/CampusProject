Feature:Hamburger Menu Finance Functionality

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario:User can track finances on campus
    Given User selects Finance from hamburger menu.
    When Three-dot drop-down menu button on user checkout page clickable.
    Then The user can select and download the desired reporting method from the drop-down menu.