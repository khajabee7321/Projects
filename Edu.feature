Feature: Multiple Users Login
@ContactUs
Scenario: ContactUs
Given OpenApplication
When Fill the all fields
Then Close Application
@Educonnect
  Scenario Outline: User should be able to log in with valid/invalid credentials
    Given the user navigates to the login page
    When the user enters "<username>" and "<password>"
    When User click on login button
    When Verify the Title of the page
    Then the user should be logged in successfully and redirected to the dashboard

  Examples:
    | username             | password    |
    | khajabeec@gmail.com  | Test@1234   |
    | user2@xyz.com        | Password456 |
    | user3@xyz.com        | Password789 |   
