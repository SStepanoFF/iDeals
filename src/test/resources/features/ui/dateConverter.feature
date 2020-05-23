@ui
Feature: [UI] Convert date to UTC+0


  Scenario: Convert Date page overview
    When open Date Converter page
    Then date converter page header text is Propine Date Parser
    And converter page invitation text is Enter a text in any format, press submit to interpret it as a date.
    And converter page input date field label is Date
    And converter page Input date field placeholder text is date
    And converter page result date field label is Results
    And result date is 0


  Scenario: Convert date to UTC+0
    Given open Date Converter page
    And enter Tue Apr 01 2013 12:59:59 GMT-12 to the input field
    When click Submit button
    Then result date is Tue Apr 02 2013 00:59:59 GMT+0000
