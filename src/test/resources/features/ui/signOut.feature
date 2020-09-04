@ui
Feature: [UI] Sign Out verification


  Scenario: Sign Out
    Given open Landing page
    When click Sign In header button
    And enter sergii@gmail.com email and password password and sign in
    And click Sign Out header button
    Then Sign In page is opened
    And Sign In button is present on the header
    And customer button is not present on the header


  Scenario: Sign Out by triggering endpoint
    Given open Landing page
    When click Sign In header button
    And enter sergii@gmail.com email and password password and sign in
    And trigger Sign Out endpoint
    Then Landing page is opened
    And Sign In button is present on the header
    And customer button is not present on the header