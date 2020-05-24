@ui
Feature: [UI] Convert date to UTC+0


  @issue:ISSUE-16
  Scenario: Convert Date page overview
    When open Date Parser page
    Then date parser page header text is Propine Date Parser
    And parser page invitation text is Enter a text in any format, press submit to interpret it as a date.
    And parser page input date field label is Date
    And parser page Input date field placeholder text is date
    And parser page result date field label is Results
    And result date is 0
    And parser page Submit button text is Submit


  Scenario: Convert date to UTC+0
    Given open Date Parser page
    And enter Tue Apr 01 2013 12:59:59 GMT-12 to the input field
    When click Submit button
    Then result date is Tue Apr 02 2013 00:59:59 GMT+0000


  @issue:ISSUE-1
  Scenario Outline: Check Input date field
    Given open Date Parser page
    When enter <inputDate> to the input field
    Then parser page Input date field contains <inputDate> text
    When click Submit button
    Then parser page Input date field contains <inputDate> text

    Examples:
      | inputDate                       |
      | Tue Apr 01 2013 12:59:59 GMT-12 |
