

Feature: Gmail login feature
  I want to use this template for my feature file

  
  Scenario: login
    Given The user is in the  gmail.login page
    When  User enters valid username and user enters valid password and user clicks on submit button
    |username|password|
    |Shayee560@gmail.com|Arjblimbsha|
    Then  title is verified
    