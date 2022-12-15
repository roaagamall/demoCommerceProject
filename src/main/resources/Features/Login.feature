@smoke


Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given   user go to login page
    And    user entre valid email and password
    Then     user click on login button
    And     check account button and url


  Scenario: user entre invalid email and valid password
    Given  user go to login page
    And    user entre invalid email "wrong@example.com" and valid password "P@ssw0rd"
    Then   user click on login button
    And    unsuccessful message
