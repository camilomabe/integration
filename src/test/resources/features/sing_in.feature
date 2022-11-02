Feature: Login in with correct credentials

  As a user of the bonite web side
  I want to sing in
  To verify that my credentials are correct

  @Login
  Scenario Outline: Login with correct credentials
    Given Camilo opens the browser in the home page
    When he enters his credentials, <user> and <pass>
    Then he should see the <user> in the login home

    Examples:
      | user       | pass        |
      | 1152696923 | Agosto2022* |