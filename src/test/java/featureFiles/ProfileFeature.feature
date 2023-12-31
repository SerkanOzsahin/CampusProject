Feature:Student profile settings functionality

  Background:
    Given the user navigates to campus website
    When the user logs in with the valid username and password
    Then the user is successfully redirected to the homepage

  Scenario:User can access profile settings on campus
    Given The student accesses the profile settings and clicks on the profile picture, which opens a window where they can change the picture.
    When when you click on the General User upload button, a page appears where you can upload the image you want.
    Then The user should receive a success message when the profile picture is uploaded.