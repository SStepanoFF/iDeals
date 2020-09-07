@ui
Feature: [UI] Sign in verification


  Scenario: Sign In positive case
    Given open Landing page
    When click Sign In header button
    And enter sergii@gmail.com to the Email Address field
    And enter password to the Password field
    And click Sign In button
    Then My Account page is opened
    And Greeting text is Welcome to your account. Here you can manage all of your personal information and orders. on My Account page
    And customer button name is Sergii Stepanov on the header
    And Sign Out button is visible on the header

@my
  Scenario: Email input field text is entered correctly
    Given open Landing page
    When click Sign In header button
    And enter sergii@gmail.com to the Email Address field
    Then email input field contains sergii@gmail.com text


  Scenario Outline: Sign In with incorrect email or password
    Given open Landing page
    When click Sign In header button
    And enter <email> email and <password> password and sign in
    And click Sign In button
    Then Error message is displayed and contains Authentication failed text

    Examples:
      | email               | password          |
      | incorrect@gmail.com | password          |
      | sergii@gmail.com    | incorrectPassword |


  Scenario Outline: Email Input field validation
    Given open Landing page
    When click Sign In header button
    And enter <email> to the Email Address field
    And enter password to the Password field
    Then email input field has <fieldColor> background color

    Examples:
      | email            | fieldColor |
      | sergiigmail.com  | red        |
      | sergii@gmail.com | green      |