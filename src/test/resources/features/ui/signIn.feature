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
    And customer name is Sergii Stepanov on the header
