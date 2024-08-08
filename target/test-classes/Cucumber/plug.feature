Feature: Login functionality
//"Here I Written the Scenario For Login Page."

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid credentials
    And I submit the login form
    Then I should see the welcome message
    //"Here I given the sample Login samples of username and Password."
         Examples:
         |username|Password|
         |subbubokka@gmail.com|Pavan1|