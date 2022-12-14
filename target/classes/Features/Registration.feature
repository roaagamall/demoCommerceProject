@smoke
  Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When  user entre gender type
    And   user entre first name "automation" and last name "tester"
    And   user enter date of birth
    And   user entre valid email
    And   user entre password "P@ssw0rd" and confirm password "P@ssw0rd"
    And   click on registration button
    Then  you register successfully
